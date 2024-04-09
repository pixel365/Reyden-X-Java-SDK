package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @since 1.0
 * @see com.reydenx.impl.Order#orderOnlineStats(Integer)
 */
public class OnlineStatsModel extends SettingsAndFactModel {
    @JsonProperty("created_at")
    protected String createdAt;

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
}
