package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Smooth Gain settings
 * 
 * @since 1.0
 * @see com.reydenx.models.OrderParametersModel
 */
@Getter
@AllArgsConstructor
public class SmoothGainModel {
    /**
     * Status
     */
    @JsonProperty("enabled")
    protected boolean enabled;

    /**
     * Minutes
     */
    @JsonProperty("minutes")
    protected Integer minutes;
}
