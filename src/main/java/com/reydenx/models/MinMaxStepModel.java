package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @since 1.0
 * @see com.reydenx.models.PriceModel
 */
public class MinMaxStepModel {
    @JsonProperty("min")
    protected Integer min;

    @JsonProperty("max")
    protected Integer max;

    @JsonProperty("step")
    protected Integer step;

    /**
     * @return Min value
     */
    public Integer getMin() {
        return min;
    }

    /**
     * @param min
     */
    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * @return Max value
     */
    public Integer getMax() {
        return max;
    }

    /**
     * @param max
     */
    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * @return Step
     */
    public Integer getStep() {
        return step;
    }

    /**
     * @param step
     */
    public void setStep(Integer step) {
        this.step = step;
    }
}
