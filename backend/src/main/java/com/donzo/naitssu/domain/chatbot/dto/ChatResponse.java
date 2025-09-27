package com.donzo.naitssu.domain.chatbot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ChatResponse {
    private String message;
    private String sessionId;
}
