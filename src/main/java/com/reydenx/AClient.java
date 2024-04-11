package com.reydenx;

import java.net.http.HttpClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.reydenx.models.TokenModel;

/**
 * Abstract Client Class
 * 
 * @since 1.0
 */
public abstract class AClient {
    protected static final String baseUrl = "https://api.reyden-x.com/v1";

    protected HttpClient httpClient;

    protected ObjectMapper mapper;

    protected String username;

    protected String password;

    protected TokenModel Token = null;


    /**
     * @return Username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username Username
     * @throws UnsupportedOperationException If username is empty
     */
    public void setUsername(String username) throws UnsupportedOperationException {
        if (username.isEmpty())
            throw new UnsupportedOperationException("Username must not be empty");

        this.username = username;
    }

    /**
     * @return Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password Password
     * @throws UnsupportedOperationException If password is empty
     */
    public void setPassword(String password) throws UnsupportedOperationException {
        if (password.isEmpty())
            throw new UnsupportedOperationException("Password must not be empty");

        this.password = password;
    }

    /**
     * @return Access Token {@link com.reydenx.models.TokenModel}
     */
    public TokenModel getToken() {
        return Token;
    }

    /**
     * @param token {@link com.reydenx.models.TokenModel}
     */
    public void setToken(TokenModel token) {
        Token = token;
    }

    /**
     * @return {@link java.net.http.HttpClient}
     */
    public HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * @param httpClient {@link java.net.http.HttpClient}
     */
    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    /**
     * @return {@link com.fasterxml.jackson.databind.ObjectMapper}
     */
    public ObjectMapper getMapper() {
        return mapper;
    }

    /**
     * @param mapper {@link com.fasterxml.jackson.databind.ObjectMapper}
     */
    public void setMapper(ObjectMapper mapper) {
        this.mapper = mapper;
    }

}
