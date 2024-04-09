package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParametersModel {
    @JsonProperty("launch_mode")
    protected String launchMode;

    @JsonProperty("work_mode")
    protected String workMode;

    @JsonProperty("delay")
    protected boolean delay;

    @JsonProperty("delay_time")
    protected Integer delayTime;

    @JsonProperty("even_distribution")
    protected boolean evenDistribution;

    @JsonProperty("even_distribution_time")
    protected Integer evenDistributionTime;

    public String getLaunchMode() {
        return launchMode;
    }

    public void setLaunchMode(String launchMode) {
        this.launchMode = launchMode;
    }

    public String getWorkMode() {
        return workMode;
    }

    public void setWorkMode(String workMode) {
        this.workMode = workMode;
    }

    public boolean isDelay() {
        return delay;
    }

    public void setDelay(boolean delay) {
        this.delay = delay;
    }

    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    public boolean isEvenDistribution() {
        return evenDistribution;
    }

    public void setEvenDistribution(boolean evenDistribution) {
        this.evenDistribution = evenDistribution;
    }

    public Integer getEvenDistributionTime() {
        return evenDistributionTime;
    }

    public void setEvenDistributionTime(Integer evenDistributionTime) {
        this.evenDistributionTime = evenDistributionTime;
    }
}
