package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Payment Model
 * 
 * @since 1.0
 */
@Getter
public class PaymentModel extends ADate {
    /**
     * Payment DateTime
     */
    @JsonProperty("payed_at")
    protected String payedAt;

    /**
     * Order Id
     */
    @JsonProperty("order_id")
    protected Integer orderId;

    /**
     * Amount
     */
    @JsonProperty("amount")
    protected Float amount;

    /**
     * External Id
     */
    @JsonProperty("external_id")
    protected String externalId;

    /**
     * Payment UUID
     */
    @JsonProperty("uuid")
    protected String uuid;

    /**
     * Link to receipt, if available
     */
    @JsonProperty("receipt")
    protected String receipt;
}
