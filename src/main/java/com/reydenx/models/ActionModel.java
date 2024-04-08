package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Action Result Model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Action
 */
public class ActionModel {
    @JsonProperty("request_id")
    protected String requestId;

    @JsonProperty("order_id")
    protected Integer orderId;

    @JsonProperty("action")
    protected String action;

    @JsonProperty("value")
    protected Integer value;

    @JsonProperty("task")
    protected TaskModel task;

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
     * @return Order Id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * @return Action Name
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return Value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * @return {@link com.reydenx.models.TaskModel}
     */
    public TaskModel getTask() {
        return task;
    }

    /**
     * @param task
     */
    public void setTask(TaskModel task) {
        this.task = task;
    }
}
