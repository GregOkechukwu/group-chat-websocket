package com.groupchatback.websocket.controller;

import com.groupchatback.websocket.pojo.Payload;
import com.groupchatback.websocket.pojo.TypingUser;
import com.groupchatback.websocket.service.TypingUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class TypingUserController {
    @Autowired
    private TypingUserService typingUserService;

    @MessageMapping("/chat/typing-user-pub")
    @SendTo("/topic/chat/typing-user-sub")
    public Payload sendTypingUsers(TypingUser user) {
        if (user.isRemoveUser()) {
            this.typingUserService.remove(user.getUserId());
        }
        else {
            this.typingUserService.add(user.getUserId(), user.getFirstName(), user.getLastName());
        }

        return new Payload(
                "typingUserIds", this.typingUserService.getTypingUserIds(),
                "typingNames", this.typingUserService.getTypingNames()
        );
    }
}
