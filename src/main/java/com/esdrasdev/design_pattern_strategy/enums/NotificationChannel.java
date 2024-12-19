package com.esdrasdev.design_pattern_strategy.enums;

import com.esdrasdev.design_pattern_strategy.service.NotificationStrategy;
import com.esdrasdev.design_pattern_strategy.service.strategy.DiscordNotificationStrategy;
import com.esdrasdev.design_pattern_strategy.service.strategy.EmailNotificationStrategy;
import com.esdrasdev.design_pattern_strategy.service.strategy.InstagramNotificationStrategy;
import com.esdrasdev.design_pattern_strategy.service.strategy.TwitterNotificationStrategy;

public enum NotificationChannel {
    DISCORD(new DiscordNotificationStrategy()),
    INSTAGRAM(new InstagramNotificationStrategy()),
    TWITTER(new TwitterNotificationStrategy()),
    EMAIL(new EmailNotificationStrategy());
//    WHATSAPP(new WhatsappNotificationStrategy());

    private final NotificationStrategy strategy;

    NotificationChannel(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public NotificationStrategy getStrategy() {
        return strategy;
    }

    public static NotificationStrategy getStrategyByChannel(String channel) {
        try {
            return NotificationChannel.valueOf(channel.toUpperCase()).getStrategy();
        } catch (IllegalArgumentException e) {
            throw new UnsupportedOperationException("Notification channel not supported: " + channel);
        }
    }
}

