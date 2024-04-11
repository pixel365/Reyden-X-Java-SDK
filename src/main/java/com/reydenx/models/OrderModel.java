package com.reydenx.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Registered Order Model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Order
 */
@Getter
public class OrderModel extends ADate {
    // TODO extras

    /**
     * Order UUID
     */
    @JsonProperty("uuid")
    protected String uuid;

    /**
     * Order status
     */
    @JsonProperty("status")
    protected String status;

    /**
     * Ordered view quantity
     */
    @JsonProperty("ordered_view_qty")
    protected Integer orderedViewQty;

    /**
     * Price per view
     */
    @JsonProperty("price_per_view")
    protected Float pricePerView;

    /**
     * Is autostart
     */
    @JsonProperty("is_autostart")
    protected boolean autostart;

    /**
     * Online users limit
     */
    @JsonProperty("online_users_limit")
    protected Integer onlineUsersLimit;

    /**
     * Platform code (twitch, youtube etc.)
     * 
     * @see com.reydenx.models.PlatformEnum
     */
    @JsonProperty("platform")
    protected String platform;

    /**
     * Content type (stream or video)
     */
    @JsonProperty("content_type")
    protected String contentType;

    /**
     * Order parameters
     * 
     * @see com.reydenx.models.ParametersModel
     */
    @JsonProperty("parameters")
    protected ParametersModel parameters;

    /**
     * Order statistics
     * 
     * @see com.reydenx.models.StatisticsModel
     */
    @JsonProperty("statistics")
    protected StatisticsModel statistics;

    /**
     * Content Classification Labels (Twitch only)
     * 
     * @see <a href=
     *      "https://help.twitch.tv/s/article/content-classification-labels?language=en_US">Read on
     *      Twitch</a>
     */
    @JsonProperty("content_classification_labels")
    protected List<String> contentClassificationLabels;

    /**
     * @param contentType Content Type (stream, video)
     * @throws UnsupportedOperationException
     */
    public void setContentType(String contentType) throws UnsupportedOperationException {
        switch (contentType) {
            case "stream":
            case "video":
                this.contentType = contentType;
                break;
            default:
                throw new UnsupportedOperationException("Only stream or video");
        }
    }
}
