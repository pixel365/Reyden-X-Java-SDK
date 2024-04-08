package com.reydenx.models;

import java.time.Instant;
import java.time.ZonedDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Access Token Model
 * 
 * @since 1.0
 */
public class TokenModel {
    @JsonProperty("access_token")
    private String accessToken = "";

    @JsonProperty("expires_in")
    private String expiresIn = "";

    /**
     * @return Сhecking that the token is not empty
     */
    public boolean valid() {
        return !getAccessToken().isEmpty() && !getExpiresIn().isEmpty();
    }

    /**
     * @return Checking the token expiration date
     */
    public boolean isAuthenticated() {
        if (!valid())
            return false;

        ZonedDateTime dateTime = ZonedDateTime.parse(getExpiresIn());
        return Instant.now().isBefore(dateTime.toInstant());
    }

    /**
     * @return Access Token
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * @return Token expiration date
     */
    public String getExpiresIn() {
        return expiresIn;
    }
}
