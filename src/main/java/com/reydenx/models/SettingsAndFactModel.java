package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * @since 1.2
 */
@Getter
public class SettingsAndFactModel {
    /**
     * Value in settings
     */
    @JsonProperty("in_settings")
    protected Float inSettings;

    /**
     * Value in fact
     */
    @JsonProperty("in_fact")
    protected Float inFact;
}
