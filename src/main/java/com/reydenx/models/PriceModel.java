package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Tariff Model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Price
 */
@Getter
public class PriceModel extends AId {
    /**
     * Tariff name
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Content format
     */
    @JsonProperty("format")
    protected String format;

    /**
     * Price
     */
    @JsonProperty("price")
    protected Float price;

    /**
     * Impression limits
     * 
     * @see com.reydenx.models.MinMaxStepModel
     */
    @JsonProperty("views")
    protected MinMaxStepModel views;

    /**
     * Limitations on the number of stream viewers
     * 
     * @see com.reydenx.models.MinMaxStepModel
     */
    @JsonProperty("online_viewers")
    protected MinMaxStepModel onlineViewers;

    /**
     * Tariff description
     */
    @JsonProperty("description")
    protected String description;

    /*
     * Tariff category
     */
    @JsonProperty("category_id")
    protected Integer categoryId;
}
