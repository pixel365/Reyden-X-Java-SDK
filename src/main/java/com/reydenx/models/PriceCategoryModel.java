package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class PriceCategoryModel extends AId {
    /**
     * Category name
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Category description
     */
    @JsonProperty("description")
    protected String description;

    /*
     * Category status
     */
    @JsonProperty("is_active")
    protected boolean isActive;
}
