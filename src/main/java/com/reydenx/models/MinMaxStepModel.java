package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Minimum and Maximum settings
 * 
 * @since 1.0
 * @see com.reydenx.models.PriceModel
 */
@Getter
public class MinMaxStepModel {
    /**
     * Minimum value
     */
    @JsonProperty("min")
    protected Integer min;

    /**
     * Maximum value
     */
    @JsonProperty("max")
    protected Integer max;

    /**
     * Step
     */
    @JsonProperty("step")
    protected Integer step;
}
