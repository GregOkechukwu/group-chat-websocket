package com.groupchatback.websocket.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TypingUser extends User {
    private boolean removeUser;

    @JsonProperty(value = "removeUser")
    public boolean isRemoveUser() {
        return removeUser;
    }

    @JsonProperty(value = "removeUser")
    public void setRemoveUser(boolean removeUser) {
        this.removeUser = removeUser;
    }
}
