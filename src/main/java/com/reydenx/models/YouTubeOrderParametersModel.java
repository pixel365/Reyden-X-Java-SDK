package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @since 1.0
 * @see com.reydenx.impl.Order#createOrderForStream(IOrderParameters)
 */
public class YouTubeOrderParametersModel extends OrderParametersModel {
    @JsonProperty("channel_url")
    String channelUrl;

    @Override
    public PlatformEnum getPlatform() {
        return PlatformEnum.YOUTUBE;
    }

    /**
     * @return YouTube Channel Url
     */
    public String getChannelUrl() {
        return channelUrl;
    }

    /**
     * @param channelUrl
     */
    public OrderParametersModel setChannelUrl(String channelUrl) {
        this.channelUrl = channelUrl;
        return this;
    }
}
