package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Traffic stats model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Traffic
 */
@Getter
public class TrafficModel {
    /**
     * Traffic entity code
     */
    @JsonProperty("code")
    protected String code;

    /**
     * Quantity
     */
    @JsonProperty("quantity")
    protected Integer quantity;
}
