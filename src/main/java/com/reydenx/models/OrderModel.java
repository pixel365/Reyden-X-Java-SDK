package com.reydenx.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Registered Order Model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Order
 */
public class OrderModel extends ADate {
    // TODO parameters, extras, statistics

    @JsonProperty("uuid")
    protected String uuid;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("ordered_view_qty")
    protected Integer orderedViewQty;

    @JsonProperty("price_per_view")
    protected Float pricePerView;

    @JsonProperty("is_autostart")
    protected boolean autostart;

    @JsonProperty("online_users_limit")
    protected Integer onlineUsersLimit;

    @JsonProperty("platform")
    protected String platform;

    @JsonProperty("content_type")
    protected String contentType;

    @JsonProperty("content_classification_labels")
    protected List<String> contentClassificationLabels;

    /**
     * @return Order String UUID
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return Order Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return Ordered view quantity
     */
    public Integer getOrderedViewQty() {
        return orderedViewQty;
    }

    /**
     * @param orderedViewQty
     */
    public void setOrderedViewQty(Integer orderedViewQty) {
        this.orderedViewQty = orderedViewQty;
    }

    /**
     * @return Price per view
     */
    public Float getPricePerView() {
        return pricePerView;
    }

    /**
     * @param pricePerView
     */
    public void setPricePerView(Float pricePerView) {
        this.pricePerView = pricePerView;
    }

    /**
     * @return Autostart
     */
    public boolean isAutostart() {
        return autostart;
    }

    /**
     * @param autostart
     */
    public void setAutostart(boolean autostart) {
        this.autostart = autostart;
    }

    /**
     * @return Online users limit
     */
    public Integer getOnlineUsersLimit() {
        return onlineUsersLimit;
    }

    /**
     * @param onlineUsersLimit
     */
    public void setOnlineUsersLimit(Integer onlineUsersLimit) {
        this.onlineUsersLimit = onlineUsersLimit;
    }

    /**
     * @return Platform code
     * @see com.reydenx.models.PlatformEnum
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * @return Content Type (stream, video etc.)
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * @param contentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * @return Content Classification Labels (Twitch only)
     * @see <a href=
     *      "https://help.twitch.tv/s/article/content-classification-labels?language=en_US">Content
     *      Clasification Labels on Twitch</a>
     */
    public List<String> getContentClassificationLabels() {
        return contentClassificationLabels;
    }

    /**
     * @param contentClassificationLabels
     */
    public void setContentClassificationLabels(List<String> contentClassificationLabels) {
        this.contentClassificationLabels = contentClassificationLabels;
    }
}
