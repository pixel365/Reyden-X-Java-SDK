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
     * @param username
     * @throws UnsupportedOperationException
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
     * @param password
     * @throws UnsupportedOperationException
     */
    public void setPassword(String password) throws UnsupportedOperationException {
        if (password.isEmpty())
            throw new UnsupportedOperationException("Password must not be empty");

        this.password = password;
    }

    /**
     * @return Acces Token Model
     */
    public TokenModel getToken() {
        return Token;
    }

    /**
     * @param token
     */
    public void setToken(TokenModel token) {
        Token = token;
    }

    /**
     * @return Http Client
     */
    public HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * @param httpClient
     */
    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    /**
     * @return Object Mapper
     */
    public ObjectMapper getMapper() {
        return mapper;
    }

    /**
     * @param mapper
     */
    public void setMapper(ObjectMapper mapper) {
        this.mapper = mapper;
    }

}
