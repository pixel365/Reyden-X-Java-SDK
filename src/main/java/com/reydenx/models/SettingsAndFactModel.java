package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SettingsAndFactModel {
    @JsonProperty("in_settings")
    protected Float inSettings;

    @JsonProperty("in_fact")
    protected Float inFact;

    /**
     * @return Value in settings
     */
    public Float getInSettings() {
        return inSettings;
    }

    /**
     * @param inSettings
     */
    public void setInSettings(Float inSettings) {
        this.inSettings = inSettings;
    }

    /**
     * @return Value in fact
     */
    public Float getInFact() {
        return inFact;
    }

    /**
     * @param inFact
     */
    public void setInFact(Float inFact) {
        this.inFact = inFact;
    }
}
