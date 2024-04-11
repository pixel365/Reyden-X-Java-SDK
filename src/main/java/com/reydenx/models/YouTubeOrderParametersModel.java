package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Parameters for create YouTube Order
 * 
 * @since 1.0
 */
@Getter
@Setter
public class YouTubeOrderParametersModel extends OrderParametersModel {
    /**
     * YouTube channel url
     */
    @JsonProperty("channel_url")
    String channelUrl;

    @Override
    public PlatformEnum getPlatform() {
        return PlatformEnum.YOUTUBE;
    }
}
