package com.esdrasdev.design_pattern_strategy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class NotificationController {

    @GetMapping("/notify")
    public void notification() {
        System.out.println("notification");
    }

}
