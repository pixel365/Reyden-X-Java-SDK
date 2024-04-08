package com.reydenx;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Objects;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reydenx.exceptions.BadRequestException;
import com.reydenx.exceptions.InternalErrorException;
import com.reydenx.exceptions.JsonException;
import com.reydenx.exceptions.NotFoundException;
import com.reydenx.exceptions.ReydenXException;
import com.reydenx.exceptions.TooManyRequestsException;
import com.reydenx.exceptions.UnauthorizedException;
import com.reydenx.exceptions.UnknownErrorException;
import com.reydenx.impl.Action;
import com.reydenx.impl.Order;
import com.reydenx.impl.Price;
import com.reydenx.impl.Traffic;
import com.reydenx.impl.User;
import com.reydenx.models.TokenModel;

/**
 * API Client
 * 
 * <pre>{@code
 * Client client = new Client("USERNAME", "PASSWORD");
 * ResultModel<OrderModel> details = client.getOrdersInstance().orderDetails(123456);
 * }</pre>
 * 
 * @since 1.0
 */
public class Client extends AClient implements IClient {
    protected Action action = null;
    protected Order order = null;
    protected Price price = null;
    protected Traffic traffic = null;
    protected User user = null;

    public Client(String username, String password) throws ReydenXException {
        setMapper(newObjectMapper());
        setHttpClient(HttpClient.newHttpClient());
        setUsername(username);
        setPassword(password);
        authentication();
    }

    protected ObjectMapper newObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }

    protected void checkAuthentication() throws UnauthorizedException {
        if (!isAuthenticated())
            throw new UnauthorizedException();
    }

    protected <T> T request(String method, String endpoint, String payload,
            TypeReference<T> typeReference) throws ReydenXException {
        checkAuthentication();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(baseUrl + endpoint))
                .method(method,
                        !payload.isEmpty() ? HttpRequest.BodyPublishers.ofString(payload)
                                : HttpRequest.BodyPublishers.noBody())
                .header("Accept", "application/json")
                .header("Authorization", "Bearer " + getToken().getAccessToken())
                .timeout(Duration.ofSeconds(10)).build();
        HttpResponse<String> response;
        try {
            response = getHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new ReydenXException(e);
        }

        switch (response.statusCode()) {
            case 200:
            case 201:
                try {
                    if (typeReference instanceof TypeReference) {
                        return getMapper().readValue(response.body(), typeReference);
                    } else {
                        return getMapper().readValue(response.body(), new TypeReference<T>() {});
                    }
                } catch (JsonProcessingException e) {
                    throw new JsonException(e);
                }
            case 400:
            case 422:
                throw new BadRequestException();
            case 401:
                throw new UnauthorizedException();
            case 404:
                throw new NotFoundException();
            case 429:
                throw new TooManyRequestsException();
            case 500:
                throw new InternalErrorException();
            default:
                throw new UnknownErrorException();
        }
    }

    @Override
    public <T> T get(String endpoint, TypeReference<T> typeReference) throws ReydenXException {
        checkAuthentication();
        return this.<T>request("GET", endpoint, "", typeReference);
    }

    @Override
    public <T> T post(String endpoint, String payload, TypeReference<T> typeReference)
            throws ReydenXException {
        checkAuthentication();
        return this.<T>request("POST", endpoint, payload, typeReference);
    }

    @Override
    public <T> T patch(String endpoint, String payload, TypeReference<T> typeReference)
            throws ReydenXException {
        checkAuthentication();
        return this.<T>request("PATCH", endpoint, payload, typeReference);
    }

    @Override
    public void delete(String endpoint) throws ReydenXException {
        checkAuthentication();
        request("DELETE", endpoint, "", null);
    }

    @Override
    public boolean isAuthenticated() {
        if (Objects.isNull(getToken()))
            return false;

        return getToken().isAuthenticated();
    }

    @Override
    public void refreshToken() throws ReydenXException {
        TokenModel newToken = patch("/token/refresh/", "", new TypeReference<TokenModel>() {});
        setToken(newToken);
    }

    @Override
    public void revokeToken() throws ReydenXException {
        delete("/token/revoke/");
    }

    @Override
    public void authentication() throws ReydenXException {
        StringBuilder form = new StringBuilder();

        form.append(URLEncoder.encode("username", StandardCharsets.UTF_8));
        form.append("=");
        form.append(URLEncoder.encode(username, StandardCharsets.UTF_8));
        form.append("&");
        form.append(URLEncoder.encode("password", StandardCharsets.UTF_8));
        form.append("=");
        form.append(URLEncoder.encode(password, StandardCharsets.UTF_8));

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(baseUrl + "/token/"))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .POST(HttpRequest.BodyPublishers.ofString(form.toString())).build();

        HttpResponse<String> response;
        try {
            response = getHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new ReydenXException(e);
        }

        switch (response.statusCode()) {
            case 200:
                try {
                    setToken(getMapper().readValue(response.body(), TokenModel.class));
                } catch (JsonProcessingException e) {
                    throw new JsonException(e);
                }
                return;
            case 422:
                throw new BadRequestException();
            case 429:
                throw new TooManyRequestsException();
            default:
                throw new UnknownErrorException();
        }
    }

    @Override
    public Action getActionsInstance() {
        if (Objects.isNull(action))
            action = new Action(this);

        return action;
    }

    @Override
    public Order getOrdersInstance() {
        if (Objects.isNull(order))
            order = new Order(this);

        return order;
    }

    @Override
    public Price getPricesInstance() {
        if (Objects.isNull(price))
            price = new Price(this);

        return price;
    }

    @Override
    public Traffic getTrafficInstance() {
        if (Objects.isNull(traffic))
            traffic = new Traffic(this);

        return traffic;
    }

    @Override
    public User getUserInstance() {
        if (Objects.isNull(user))
            user = new User(this);

        return user;
    }
}
