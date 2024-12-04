package com.esdrasdev.design_pattern_strategy.service;

import com.esdrasdev.design_pattern_strategy.enums.NotificationChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public void notify(String channel, String destination, String message) {
        NotificationStrategy strategy = NotificationChannel.getStrategyByChannel(channel);
        strategy.sendNotification(destination, message);
    }
}
