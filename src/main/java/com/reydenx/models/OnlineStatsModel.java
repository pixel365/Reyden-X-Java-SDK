package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Order online stats model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Order#orderOnlineStats(Integer)
 */
@Getter
public class OnlineStatsModel extends SettingsAndFactModel {
    /**
     * DateTime
     */
    @JsonProperty("created_at")
    protected String createdAt;
}
