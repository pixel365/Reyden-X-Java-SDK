package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatisticsModel {
    @JsonProperty("active_time_in_seconds")
    protected Integer activeTimeInSeconds;

    @JsonProperty("views")
    protected Integer views;

    @JsonProperty("clicks")
    protected Integer clicks;

    @JsonProperty("ctr")
    protected Integer ctr;

    @JsonProperty("average")
    protected AverageModel average;

    public Integer getActiveTimeInSeconds() {
        return activeTimeInSeconds;
    }

    public void setActiveTimeInSeconds(Integer activeTimeInSeconds) {
        this.activeTimeInSeconds = activeTimeInSeconds;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Integer getCtr() {
        return ctr;
    }

    public void setCtr(Integer ctr) {
        this.ctr = ctr;
    }

    public AverageModel getAverage() {
        return average;
    }

    public void setAverage(AverageModel average) {
        this.average = average;
    }
}
