package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model of successful response to a request
 * 
 * @since 1.0
 */
public class ResultModel<T> {
    @JsonProperty("request_id")
    protected String requestId;

    @JsonProperty("cached")
    protected boolean cached;

    @JsonProperty("cache_expires_at")
    protected String cacheExpiresAt;

    @JsonProperty("cursor")
    protected String cursor;

    @JsonProperty("result")
    protected T result;

    /**
     * @return Request Id
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * @return Is the data cached?
     */
    public boolean isCached() {
        return cached;
    }

    /**
     * @param cached
     */
    public void setCached(boolean cached) {
        this.cached = cached;
    }

    /**
     * @return If the result is cached, then this field indicates the date and time until which the
     *         cache is valid
     */
    public String getCacheExpiresAt() {
        return cacheExpiresAt;
    }

    /**
     * @param cacheExpiresAt
     */
    public void setCacheExpiresAt(String cacheExpiresAt) {
        this.cacheExpiresAt = cacheExpiresAt;
    }

    /**
     * @return If the result contains multiple pages, the cursor provides access to the next one
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * @param cursor
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    /**
     * @return Result of the corresponding type
     */
    public T getResult() {
        return result;
    }

    /**
     * @param result
     */
    public void setResult(T result) {
        this.result = result;
    }
}
