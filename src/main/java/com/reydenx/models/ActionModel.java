package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Action Result Model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Action
 */
@Getter
public class ActionModel {
    /**
     * Request Id
     */
    @JsonProperty("request_id")
    protected String requestId;

    /**
     * Order Id
     */
    @JsonProperty("order_id")
    protected Integer orderId;

    /**
     * Action code
     */
    @JsonProperty("action")
    protected String action;

    /**
     * Value
     */
    @JsonProperty("value")
    protected Integer value;

    /**
     * Task Model
     * 
     * @see com.reydenx.models.TaskModel
     */
    @JsonProperty("task")
    protected TaskModel task;
}
