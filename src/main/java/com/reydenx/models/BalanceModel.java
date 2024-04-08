package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User Balance Model
 * 
 * @since 1.0
 * @see com.reydenx.impl.User#balance()
 */
public class BalanceModel extends AId {
    @JsonProperty("amount")
    protected Float amount;

    @JsonProperty("currency_id")
    protected Integer currencyId;

    @JsonProperty("user_id")
    protected Integer userId;

    @JsonProperty("formatted_amount")
    protected Float formattedAmount;

    @JsonProperty("currency")
    protected String currency;

    /**
     * @return Account amount
     */
    public Float getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(Float amount) {
        this.amount = amount;
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
     * @return User Id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return Account formatted amount
     */
    public Float getFormattedAmount() {
        return formattedAmount;
    }

    /**
     * @param formattedAmount
     */
    public void setFormattedAmount(Float formattedAmount) {
        this.formattedAmount = formattedAmount;
    }

    /**
     * @return Currency code (ISO 4217)
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency Currency code (ISO 4217)
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
