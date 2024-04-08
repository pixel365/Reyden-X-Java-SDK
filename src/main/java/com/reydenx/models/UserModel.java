package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User account model
 * 
 * @since 1.0
 * @see com.reydenx.impl.User#account()
 */
public class UserModel extends AId {
    @JsonProperty("username")
    protected String username;

    @JsonProperty("date_joined")
    protected String dateJoined;

    @JsonProperty("email")
    protected String email;

    @JsonProperty("is_active")
    protected boolean active;

    @JsonProperty("is_blocked")
    protected boolean blocked;

    @JsonProperty("is_reseller")
    protected boolean reseller;

    @JsonProperty("has_image")
    protected boolean avatar;

    @JsonProperty("image_extension")
    protected String avatarExtension;

    @JsonProperty("image_url")
    protected String avatarUrl;

    @JsonProperty("currency_id")
    protected Integer currencyId;

    @JsonProperty("discount_value")
    protected Float discountValue;

    @JsonProperty("twitch_id")
    protected Integer twitchId;

    @JsonProperty("twitch_login")
    protected String twitchUsername;

    /**
     * @return Username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return Registration date
     */
    public String getDateJoined() {
        return dateJoined;
    }

    /**
     * @param dateJoined
     */
    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    /**
     * @return Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Is User Active?
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return Is User Banned?
     */
    public boolean isBlocked() {
        return blocked;
    }

    /**
     * @param blocked
     */
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * @return Is User Reseller?
     */
    public boolean isReseller() {
        return reseller;
    }

    /**
     * @param reseller
     */
    public void setReseller(boolean reseller) {
        this.reseller = reseller;
    }

    /**
     * @return Has Avatar?
     */
    public boolean hasAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(boolean avatar) {
        this.avatar = avatar;
    }

    /**
     * @return If the User has an avatar, then its extension
     */
    public String getAvatarExtension() {
        return avatarExtension;
    }

    /**
     * @param avatarExtension
     */
    public void setAvatarExtension(String avatarExtension) {
        this.avatarExtension = avatarExtension;
    }

    /**
     * @return If the User has an avatar, then a link to it
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * @return Currency Id
     */
    public Integer getCurrencyId() {
        return currencyId;
    }

    /**
     * @param currencyId
     */
    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * @return Personal discount, if available
     */
    public Float getDiscountValue() {
        return discountValue;
    }

    /**
     * @param discountValue
     */
    public void setDiscountValue(Float discountValue) {
        this.discountValue = discountValue;
    }

    /**
     * @return Twitch Id, if linked account exists
     */
    public Integer getTwitchId() {
        return twitchId;
    }

    /**
     * @param twitchId
     */
    public void setTwitchId(Integer twitchId) {
        this.twitchId = twitchId;
    }

    /**
     * @return Twitch Username, if linked account exists
     */
    public String getTwitchUsername() {
        return twitchUsername;
    }

    /**
     * @param twitchUsername
     */
    public void setTwitchUsername(String twitchUsername) {
        this.twitchUsername = twitchUsername;
    }
}
