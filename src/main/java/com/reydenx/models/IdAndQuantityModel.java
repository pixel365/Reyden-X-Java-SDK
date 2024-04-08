package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @since 1.0
 * @see com.reydenx.impl.Order#multipleOrdersClicksStats(java.util.List)
 * @see com.reydenx.impl.Order#multipleOrdersViewsStats(java.util.List)
 */
public class IdAndQuantityModel extends AId {
    @JsonProperty("quantity")
    protected Integer quantity;

    /**
     * @return Some quantity
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
