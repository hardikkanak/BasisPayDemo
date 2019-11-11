package com.basispaydemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PaymentResModel implements Serializable {

    @SerializedName("order_id")
    @Expose
    private String orderId;
    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("address_line_1")
    @Expose
    private Object addressLine1;
    @SerializedName("address_line_2")
    @Expose
    private Object addressLine2;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("zip_code")
    @Expose
    private String zipCode;
    @SerializedName("udf1")
    @Expose
    private Object udf1;
    @SerializedName("udf2")
    @Expose
    private Object udf2;
    @SerializedName("udf3")
    @Expose
    private Object udf3;
    @SerializedName("udf4")
    @Expose
    private Object udf4;
    @SerializedName("udf5")
    @Expose
    private Object udf5;
    @SerializedName("transaction_id")
    @Expose
    private String transactionId;
    @SerializedName("payment_mode")
    @Expose
    private String paymentMode;
    @SerializedName("payment_channel")
    @Expose
    private String paymentChannel;
    @SerializedName("payment_datetime")
    @Expose
    private String paymentDatetime;
    @SerializedName("response_code")
    @Expose
    private int responseCode;
    @SerializedName("response_message")
    @Expose
    private String responseMessage;
    @SerializedName("error_desc")
    @Expose
    private String errorDesc;
    @SerializedName("cardmasked")
    @Expose
    private Object cardmasked;
    @SerializedName("hash")
    @Expose
    private String hash;
    private final static long serialVersionUID = -92618579446147260L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(Object addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Object getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(Object addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Object getUdf1() {
        return udf1;
    }

    public void setUdf1(Object udf1) {
        this.udf1 = udf1;
    }

    public Object getUdf2() {
        return udf2;
    }

    public void setUdf2(Object udf2) {
        this.udf2 = udf2;
    }

    public Object getUdf3() {
        return udf3;
    }

    public void setUdf3(Object udf3) {
        this.udf3 = udf3;
    }

    public Object getUdf4() {
        return udf4;
    }

    public void setUdf4(Object udf4) {
        this.udf4 = udf4;
    }

    public Object getUdf5() {
        return udf5;
    }

    public void setUdf5(Object udf5) {
        this.udf5 = udf5;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public String getPaymentDatetime() {
        return paymentDatetime;
    }

    public void setPaymentDatetime(String paymentDatetime) {
        this.paymentDatetime = paymentDatetime;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public Object getCardmasked() {
        return cardmasked;
    }

    public void setCardmasked(Object cardmasked) {
        this.cardmasked = cardmasked;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

}