package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Task model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Action
 */
@Getter
public class TaskModel {
    /**
     * Task Id
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Link to check status
     */
    @JsonProperty("url")
    protected String url;

    /**
     * Date and time until which status check is available
     */
    @JsonProperty("expires_at")
    protected String expiresAt;
}
