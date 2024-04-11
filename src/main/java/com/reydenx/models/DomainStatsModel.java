package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Order domain stats model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Order#orderDomainsStats(Integer)
 */
@Getter
public class DomainStatsModel {
    /**
     * Domain name
     */
    @JsonProperty("domain")
    protected String domain;

    /**
     * Views count
     */
    @JsonProperty("views")
    protected Integer views;

    /**
     * Clicks count
     */
    @JsonProperty("clicks")
    protected Integer clicks;

    /**
     * CTR
     */
    @JsonProperty("ctr")
    protected Float ctr;
}
