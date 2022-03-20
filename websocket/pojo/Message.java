package com.groupchatback.websocket.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message extends User {
    private String messageId;
    private String messageContent;
    private String dateSent;

    public Message() {}

    @JsonProperty(value = "messageId")
    public String getMessageId() {
        return messageId;
    }

    @JsonProperty(value = "messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @JsonProperty(value = "messageContent")
    public String getMessageContent() {
        return messageContent;
    }

    @JsonProperty(value = "messageContent")
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    @JsonProperty(value = "dateSent")
    public String getDateSent() {
        return dateSent;
    }

    @JsonProperty(value = "dateSent")
    public void setDateSent(String dateSent) {
        this.dateSent = dateSent;
    }
}