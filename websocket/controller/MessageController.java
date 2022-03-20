package com.groupchatback.websocket.controller;

import com.groupchatback.websocket.pojo.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/chat/message-pub")
    @SendTo("/topic/chat/message-sub")
    public Message sendChatMessage(Message message) {
        return message;
    }

}
