package com.cbcf.model;

//NonUeN2InfoSubscribe
public class NonUeN2InfoSubscribeRequest {
    private String subscriptionId;
    private String ueId;

    //getters & setters
    public String getSubscriptionId() { return subscriptionId; }
    public void setSubscriptionId(String subscriptionId) { this.subscriptionId = subscriptionId; }

    public String getUeId() { return ueId; }
    public void setUeId(String ueId) { this.ueId = ueId; }
}
