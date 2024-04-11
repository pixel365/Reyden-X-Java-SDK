package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * @since 1.2
 */
@Getter
public class ParametersModel {
    /**
     * Launch Mode (Possible values: auto, manual, delay)
     */
    @JsonProperty("launch_mode")
    protected String launchMode;

    /**
     * Work Mode (Possible values: with-stream, without-stream)
     */
    @JsonProperty("work_mode")
    protected String workMode;

    /**
     * delay is enabled
     */
    @JsonProperty("delay")
    protected boolean delay;

    /**
     * Delay time in seconds
     */
    @JsonProperty("delay_time")
    protected Integer delayTime;

    /**
     * Even distribution is enabled
     */
    @JsonProperty("even_distribution")
    protected boolean evenDistribution;

    /**
     * Even distribution time in seconds
     */
    @JsonProperty("even_distribution_time")
    protected Integer evenDistributionTime;
}
