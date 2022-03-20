package com.groupchatback.websocket.pojo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class Payload {
    private Map<String, Object> properties = new HashMap<>();

    public Payload() {
    }

    public Payload(String key, Object value) {
        this.add(key, value);
    }

    public Payload(String key1, Object value1, String key2, Object value2) {
        this.add(key1, value1);
        this.add(key2, value2);
    }

    public Payload(String key1, Object value1, String key2, Object value2, String key3, Object value3) {
        this.add(key1, value1);
        this.add(key2, value2);
        this.add(key3, value3);
    }

    @JsonAnyGetter
    public Map<String, Object> getProperties() {
        return properties;
    }

    @JsonAnySetter
    public void add(String key, Object value) {
        this.properties.put(key, value);
    }

    public Object get(String key) {
        return this.getProperties().get(key);
    }
}
