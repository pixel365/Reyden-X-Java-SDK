package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tariff Model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Price
 */
public class PriceModel extends AId {
    @JsonProperty("name")
    protected String name;

    @JsonProperty("format")
    protected String format;

    @JsonProperty("price")
    protected Float price;

    @JsonProperty("views")
    protected MinMaxStepModel views;

    @JsonProperty("online_viewers")
    protected MinMaxStepModel onlineViewers;

    @JsonProperty("description")
    protected String description;

    /**
     * @return Tariff Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Content Format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * @return Cost per 1 impression
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return Impressions Options
     */
    public MinMaxStepModel getViews() {
        return views;
    }

    /**
     * @param views
     */
    public void setViews(MinMaxStepModel views) {
        this.views = views;
    }

    /**
     * @return Viewer Options
     */
    public MinMaxStepModel getOnlineViewers() {
        return onlineViewers;
    }

    /**
     * @param onlineViewers
     */
    public void setOnlineViewers(MinMaxStepModel onlineViewers) {
        this.onlineViewers = onlineViewers;
    }

    /**
     * @return Tariff Description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
