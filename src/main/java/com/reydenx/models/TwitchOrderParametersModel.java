package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @since 1.0
 * @see com.reydenx.impl.Order#createOrderForStream(IOrderParameters)
 */
public class TwitchOrderParametersModel extends OrderParametersModel {
    @JsonProperty("twitch_id")
    protected Integer twitchId;

    @Override
    public PlatformEnum getPlatform() {
        return PlatformEnum.TWITCH;
    }

    /**
     * @return Twitch channel Id
     */
    public Integer getTwitchId() {
        return twitchId;
    }

    /**
     * @param twitchId
     * @return
     */
    public OrderParametersModel setTwitchId(Integer twitchId) {
        this.twitchId = twitchId;
        return this;
    }
}
