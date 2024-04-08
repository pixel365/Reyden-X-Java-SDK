package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Payment Model
 * 
 * @since 1.0
 * @see {@link com.reydenx.impl.Order#orderPayments(Integer, String)}
 */
public class PaymentModel extends ADate {
    @JsonProperty("payed_at")
    protected String payedAt;

    @JsonProperty("order_id")
    protected Integer orderId;

    @JsonProperty("amount")
    protected Float amount;

    @JsonProperty("external_id")
    protected String externalId;

    @JsonProperty("uuid")
    protected String uuid;

    @JsonProperty("receipt")
    protected String receipt;

    /**
     * @return Date and time of payment
     */
    public String getPayedAt() {
        return payedAt;
    }

    /**
     * @param payedAt
     */
    public void setPayedAt(String payedAt) {
        this.payedAt = payedAt;
    }

    /**
     * @return Order Id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * @return Payment amount
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
     * @return External Id
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * @param externalId
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * @return Payment UUID
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return Link to cash receipt (if available)
     */
    public String getReceipt() {
        return receipt;
    }

    /**
     * @param receipt
     */
    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }
}
