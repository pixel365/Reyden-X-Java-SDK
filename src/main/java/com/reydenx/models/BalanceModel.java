package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * User Balance Model
 * 
 * @since 1.0
 * @see com.reydenx.impl.User#balance()
 */
@Getter
public class BalanceModel extends AId {
    /**
     * Amount
     */
    @JsonProperty("amount")
    protected Float amount;

    /**
     * Currency Id
     */
    @JsonProperty("currency_id")
    protected Integer currencyId;

    /**
     * User Id
     */
    @JsonProperty("user_id")
    protected Integer userId;

    /**
     * Account formatted amount
     */
    @JsonProperty("formatted_amount")
    protected Float formattedAmount;

    /**
     * currency Currency code (ISO 4217)
     */
    @JsonProperty("currency")
    protected String currency;
}
