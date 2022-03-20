package com.groupchatback.websocket.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting extends User {
    private String greetingContent;

    @JsonProperty(value = "greetingContent")
    public String getGreetingContent() {
        return greetingContent;
    }

    @JsonProperty(value = "greetingContent")
    public void setGreetingContent(String greetingContent) {
        this.greetingContent = greetingContent;
    }
}
