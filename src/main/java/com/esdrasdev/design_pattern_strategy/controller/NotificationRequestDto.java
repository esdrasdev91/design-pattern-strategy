package com.esdrasdev.design_pattern_strategy.controller;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationRequestDto {

    @NotBlank
    private String channel;

    @NotBlank
    private String message;

    @NotBlank
    private String destination;


    public void NotificationRequest(String channel, String destination, String message) {
        if (channel == null || channel.isBlank()) {
            throw new IllegalArgumentException("Channel cannot be blank");
        }
        if (destination == null || destination.isBlank()) {
            throw new IllegalArgumentException("Destination cannot be blank");
        }
        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("Message cannot be blank");
        }

        this.channel = channel;
        this.destination = destination;
        this.message = message;
    }

}
