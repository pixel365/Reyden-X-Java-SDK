package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * User account model
 * 
 * @since 1.0
 * @see com.reydenx.impl.User#account()
 */
@Getter
public class UserModel extends AId {
    /**
     * Username
     */
    @JsonProperty("username")
    protected String username;

    /**
     * Registration date
     */
    @JsonProperty("date_joined")
    protected String dateJoined;

    /**
     * Email
     */
    @JsonProperty("email")
    protected String email;

    /**
     * Activity status
     */
    @JsonProperty("is_active")
    protected boolean active;

    /**
     * Blocking status
     */
    @JsonProperty("is_blocked")
    protected boolean blocked;

    /**
     * Reseller status
     */
    @JsonProperty("is_reseller")
    protected boolean reseller;

    /**
     * Avatar URL if exists
     */
    @JsonProperty("image_url")
    protected String avatarUrl;

    /**
     * Currency Id
     */
    @JsonProperty("currency_id")
    protected Integer currencyId;

    /**
     * Personal discount, if available
     */
    @JsonProperty("discount_value")
    protected Float discountValue;

    /**
     * Twitch Id, if linked account exists
     */
    @JsonProperty("twitch_id")
    protected Integer twitchId;

    /**
     * Twitch Username, if linked account exists
     */
    @JsonProperty("twitch_login")
    protected String twitchUsername;
}
