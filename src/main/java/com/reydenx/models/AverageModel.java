package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AverageModel {
    @JsonProperty("online")
    protected SettingsAndFactModel online;

    @JsonProperty("session_in_seconds")
    protected Integer sessionInSeconds;

    public SettingsAndFactModel getOnline() {
        return online;
    }

    public void setOnline(SettingsAndFactModel online) {
        this.online = online;
    }

    public Integer getSessionInSeconds() {
        return sessionInSeconds;
    }

    public void setSessionInSeconds(Integer sessionInSeconds) {
        this.sessionInSeconds = sessionInSeconds;
    }
}
