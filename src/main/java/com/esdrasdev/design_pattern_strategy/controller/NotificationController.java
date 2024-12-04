package com.esdrasdev.design_pattern_strategy.controller;

import com.esdrasdev.design_pattern_strategy.service.NotificationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/send")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/notify")
    public ResponseEntity<Void> send(@RequestBody @Valid NotificationRequestDto request) {
        notificationService.notify(
                request.getChannel(),
                request.getDestination(),
                request.getMessage()
        );

        return ResponseEntity.accepted().build();
    }

}
