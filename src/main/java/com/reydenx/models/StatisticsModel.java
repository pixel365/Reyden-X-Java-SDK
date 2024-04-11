package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * @since 1.2
 */
@Getter
public class StatisticsModel {
    @JsonProperty("active_time_in_seconds")
    protected Integer activeTimeInSeconds;

    /**
     * Number of impressions
     */
    @JsonProperty("views")
    protected Integer views;

    /**
     * Number of clicks
     */
    @JsonProperty("clicks")
    protected Integer clicks;

    /**
     * CTR
     */
    @JsonProperty("ctr")
    protected Integer ctr;

    /**
     * Average values
     * 
     * @see com.reydenx.models.AverageModel
     */
    @JsonProperty("average")
    protected AverageModel average;
}
