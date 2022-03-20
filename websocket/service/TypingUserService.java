package com.groupchatback.websocket.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TypingUserService {
    private final Map<String, String> typingUserLookup = new LinkedHashMap<>();
    private final Set<String> typingNames = new LinkedHashSet<>();

    public void add(String userId, String firstName, String lastName) {
        this.typingUserLookup.put(userId, firstName + " " + lastName);
        this.typingNames.add(firstName + " " + lastName);
    }

    public void remove(String userId) {
        this.typingNames.remove(this.typingUserLookup.getOrDefault(userId, ""));
        this.typingUserLookup.remove(userId);
    }

    public Set<String> getTypingUserIds() {
        return this.typingUserLookup.keySet();
    }

    public Set<String> getTypingNames() {
        return this.typingNames;
    }
}
