package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @since 1.0
 * @see com.reydenx.models.OrderParametersModel
 */
public class SmoothGainModel {
    @JsonProperty("enabled")
    protected boolean enabled;

    @JsonProperty("minutes")
    protected Integer minutes;

    public SmoothGainModel(boolean enabled, Integer minutes) {
        this.setEnabled(enabled);
        this.setMinutes(minutes);
    }

    /**
     * @return Status
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * @return Minutes
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * @param minutes
     */
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }
}
