package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * @since 1.0
 * @see com.reydenx.impl.Order#orderClicksStats(Integer)
 * @see com.reydenx.impl.Order#orderViewsStats(Integer)
 */
@Getter
public class DateAndQuantityModel {
    /**
     * Date
     */
    @JsonProperty("date")
    protected String date;

   /**
     * Quantity
     */
     @JsonProperty("quantity")
    protected Integer quantity;
}
