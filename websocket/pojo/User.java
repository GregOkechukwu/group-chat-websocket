package com.groupchatback.websocket.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User extends Payload {
    private String userId;
    private String username;
    private String firstName;
    private String lastName;
    private boolean isOnline;
    private boolean hasProfilePic;
    private String base64;
    private String mimeType;

    @JsonProperty(value = "userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty(value = "userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty(value = "username")
    public String getUsername() {
        return username;
    }

    @JsonProperty(value = "username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty(value = "firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty(value = "firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty(value = "lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty(value = "lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty(value = "isOnline")
    public boolean isOnline() {
        return isOnline;
    }

    @JsonProperty(value = "isOnline")
    public void setOnline(boolean online) {
        isOnline = online;
    }

    @JsonProperty(value = "hasProfilePic")
    public boolean isHasProfilePic() {
        return hasProfilePic;
    }

    @JsonProperty(value = "hasProfilePic")
    public void setHasProfilePic(boolean hasProfilePic) {
        this.hasProfilePic = hasProfilePic;
    }

    @JsonProperty(value = "base64")
    public String getBase64() {
        return base64;
    }

    @JsonProperty(value = "base64")
    public void setBase64(String base64) {
        this.base64 = base64;
    }

    @JsonProperty(value = "mimeType")
    public String getMimeType() {
        return mimeType;
    }

    @JsonProperty(value = "mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
}
