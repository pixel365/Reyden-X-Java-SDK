package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @since 1.0
 * @see com.reydenx.impl.Order#orderDomainsStats(Integer)
 */
public class DomainStatsModel {
    @JsonProperty("domain")
    protected String domain;

    @JsonProperty("views")
    protected Integer views;

    @JsonProperty("clicks")
    protected Integer clicks;

    @JsonProperty("ctr")
    protected Float ctr;

    /**
     * @return Domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * @return Views quantity
     */
    public Integer getViews() {
        return views;
    }

    /**
     * @param views
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * @return Clicks quantity
     */
    public Integer getClicks() {
        return clicks;
    }

    /**
     * @param clicks
     */
    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    /**
     * @return CTR
     */
    public Float getCtr() {
        return ctr;
    }

    /**
     * @param ctr
     */
    public void setCtr(Float ctr) {
        this.ctr = ctr;
    }
}
