package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Model of successful response to a request
 * 
 * @param <T> Any Model
 * @since 1.0
 */
@Getter
public class ResultModel<T> {
    /**
     * Request Id
     */
    @JsonProperty("request_id")
    protected String requestId;

    /**
     * Is the data cached?
     */
    @JsonProperty("cached")
    protected boolean cached;

    /**
     * If the result is cached, then this field indicates the date and time until which the cache is
     * valid
     */
    @JsonProperty("cache_expires_at")
    protected String cacheExpiresAt;

    /**
     * If the result contains multiple pages, the cursor provides access to the next one
     */
    @JsonProperty("cursor")
    protected String cursor;

    /**
     * Result of the corresponding type
     */
    @JsonProperty("result")
    protected T result;
}
