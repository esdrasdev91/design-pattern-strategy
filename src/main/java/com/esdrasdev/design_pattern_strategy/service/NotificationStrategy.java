package com.esdrasdev.design_pattern_strategy.service;

public interface NotificationStrategy {

    void sendNotification(String destination, String message);
}
