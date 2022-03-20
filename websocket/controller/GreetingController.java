package com.groupchatback.websocket.controller;

import com.groupchatback.websocket.pojo.Greeting;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/chat/greeting-pub")
    @SendTo("/topic/chat/greeting-sub")
    public Greeting sendGreeting(Greeting greeting) {
        return greeting;
    }

}
