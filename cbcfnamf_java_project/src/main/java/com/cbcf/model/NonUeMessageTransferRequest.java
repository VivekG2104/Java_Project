package com.cbcf.model;

//NonUeMessageTransfer
public class NonUeMessageTransferRequest {
    private String messageId;
    private String content;
    private String targetPlmn;

    //getters & setters
    public String getMessageId() { return messageId; }
    public void setMessageId(String messageId) { this.messageId = messageId; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getTargetPlmn() { return targetPlmn; }
    public void setTargetPlmn(String targetPlmn) { this.targetPlmn = targetPlmn; }
}
