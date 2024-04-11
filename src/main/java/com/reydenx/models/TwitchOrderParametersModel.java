package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Parameters for create Twitch Order
 * 
 * @since 1.0
 */
@Getter
@Setter
public class TwitchOrderParametersModel extends OrderParametersModel {
    /**
     * Twitch channel Id
     */
    @JsonProperty("twitch_id")
    protected Integer twitchId;

    @Override
    public PlatformEnum getPlatform() {
        return PlatformEnum.TWITCH;
    }
}
