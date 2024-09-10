package com.ram.pms.config;

import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class WebSocketHandler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, org.springframework.web.socket.TextMessage message) throws Exception {
        // Handle incoming messages here
        session.sendMessage(new org.springframework.web.socket.TextMessage("Received: " + message.getPayload()));
    }
}
