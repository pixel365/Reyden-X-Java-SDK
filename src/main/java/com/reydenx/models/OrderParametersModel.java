package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Base parameters for new Orders
 * 
 * @since 1.0
 */
@Getter
@Setter
public abstract class OrderParametersModel implements IOrderParameters {
    /**
     * Price Id
     * 
     * @see com.reydenx.impl.Price
     */
    @JsonProperty("price_id")
    protected Integer priceId;

    /**
     * Views quantity
     */
    @JsonProperty("number_of_views")
    protected Integer numberOfViews;

    /**
     * Viewers quantity
     */
    @JsonProperty("number_of_viewers")
    protected Integer numberOfViewers;

    /**
     * Launch Mode (Possible values: auto, manual, delay)
     */
    @JsonProperty("launch_mode")
    protected String launchMode;

    /**
     * SmoothGain settings
     * 
     * @see com.reydenx.models.SmoothGainModel
     */
    @JsonProperty("smooth_gain")
    protected SmoothGainModel smoothGain;

    /**
     * Delay time in seconds
     */
    @JsonProperty("delay_time")
    protected Integer delayTime;

    /**
     * @param launchMode Launch Mode (Possible values: auto, manual, delay)
     * @return {@link com.reydenx.models.OrderParametersModel}
     * @throws UnsupportedOperationException
     */
    public OrderParametersModel setLaunchMode(String launchMode)
            throws UnsupportedOperationException {
        switch (launchMode) {
            case "auto":
            case "manual":
            case "delay":
                this.launchMode = launchMode;
                return this;
            default:
                throw new UnsupportedOperationException("Possible values: auto, manual, delay");
        }
    }
}
