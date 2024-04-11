package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * ID and Quantity model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Order#multipleOrdersClicksStats(java.util.List)
 * @see com.reydenx.impl.Order#multipleOrdersViewsStats(java.util.List)
 */
@Getter
public class IdAndQuantityModel extends AId {
    /**
     * Quantity
     */
    @JsonProperty("quantity")
    protected Integer quantity;
}
