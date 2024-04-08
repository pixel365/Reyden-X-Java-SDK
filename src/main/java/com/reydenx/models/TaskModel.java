package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Task model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Action
 */
public class TaskModel {
    @JsonProperty("id")
    protected String id;

    @JsonProperty("url")
    protected String url;

    @JsonProperty("expires_at")
    protected String expiresAt;

    /**
     * @return Task Id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return Link to check status
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return Date and time until which status check is available
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * @param expiresAt
     */
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }
}
