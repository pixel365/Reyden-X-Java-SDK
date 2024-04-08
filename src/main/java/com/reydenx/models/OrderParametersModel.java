package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @since 1.0
 * @see com.reydenx.impl.Order#createOrderForStream(IOrderParameters)
 */
public abstract class OrderParametersModel implements IOrderParameters {
    @JsonProperty("price_id")
    protected Integer priceId;

    @JsonProperty("number_of_views")
    protected Integer numberOfViews;

    @JsonProperty("number_of_viewers")
    protected Integer numberOfViewers;

    @JsonProperty("launch_mode")
    protected String launchMode;

    @JsonProperty("smooth_gain")
    protected SmoothGainModel smoothGain;

    @JsonProperty("delay_time")
    protected Integer delayTime;

    /**
     * @return Price Id
     * @see com.reydenx.models.PriceModel
     */
    public Integer getPriceId() {
        return priceId;
    }

    public OrderParametersModel setPriceId(Integer priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     * @return Views quantity
     */
    public Integer getNumberOfViews() {
        return numberOfViews;
    }

    /**
     * @param numberOfViews
     */
    public OrderParametersModel setNumberOfViews(Integer numberOfViews) {
        this.numberOfViews = numberOfViews;
        return this;
    }

    /**
     * @return Viewers quantity
     */
    public Integer getNumberOfViewers() {
        return numberOfViewers;
    }

    /**
     * @param numberOfViewers
     */
    public OrderParametersModel setNumberOfViewers(Integer numberOfViewers) {
        this.numberOfViewers = numberOfViewers;
        return this;
    }

    /**
     * @return Launch Mode (Possible values: auto, manual, delay)
     */
    public String getLaunchMode() {
        return launchMode;
    }

    /**
     * @param launchMode
     */
    public OrderParametersModel setLaunchMode(String launchMode) {
        this.launchMode = launchMode;
        return this;
    }

    /**
     * @return SmoothGainModel
     * @see com.reydenx.models.SmoothGainModel
     */
    public SmoothGainModel getSmoothGain() {
        return smoothGain;
    }

    /**
     * @param smoothGain
     */
    public OrderParametersModel setSmoothGain(SmoothGainModel smoothGain) {
        this.smoothGain = smoothGain;
        return this;
    }

    /**
     * @return Delay time in seconds
     */
    public Integer getDelayTime() {
        return delayTime;
    }

    /**
     * @param delayTime
     */
    public OrderParametersModel setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }
}
