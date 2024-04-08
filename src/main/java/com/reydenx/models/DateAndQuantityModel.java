package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @since 1.0
 * @see com.reydenx.impl.Order#orderClicksStats(Integer)
 * @see com.reydenx.impl.Order#orderViewsStats(Integer)
 */
public class DateAndQuantityModel {
    @JsonProperty("date")
    protected String date;

    @JsonProperty("quantity")
    protected Integer quantity;

    /**
     * @return Datetime String
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

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
