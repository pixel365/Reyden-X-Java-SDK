package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * @since 1.2
 */
@Getter
public class AverageModel {
    /**
     * SettingsAndFactModel
     * 
     * @see com.reydenx.models.SettingsAndFactModel
     */
    @JsonProperty("online")
    protected SettingsAndFactModel online;

    /**
     * Total session time
     */
    @JsonProperty("session_in_seconds")
    protected Integer sessionInSeconds;
}
