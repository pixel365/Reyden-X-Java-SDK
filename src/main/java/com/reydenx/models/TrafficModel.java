package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Traffic stats model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Traffic
 */
public class TrafficModel {
    @JsonProperty("code")
    protected String code;

    @JsonProperty("quantity")
    protected Integer quantity;

    /**
     * @return Traffic Type
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return Value
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
