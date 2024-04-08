package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @since 1.0
 * @see com.reydenx.impl.Order#orderOnlineStats(Integer)
 */
public class OnlineStatsModel {
    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("in_settings")
    protected Float inSettings;

    @JsonProperty("in_fact")
    protected Float inFact;

    /**
     * @return Datetime String
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

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
