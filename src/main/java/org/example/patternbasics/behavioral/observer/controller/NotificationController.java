package org.example.patternbasics.behavioral.observer.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.patternbasics.behavioral.observer.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// REST API Controller using the Notification Service
@RequiredArgsConstructor
@RestController
@RequestMapping("/notifications")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
class NotificationController {
    NotificationService service;

    @PostMapping("/send")
    public ResponseEntity<String> sendNotification(@RequestBody String message) {
        // Send notification
        service.sendNotification(message);

        return ResponseEntity.ok("Notification sent successfully");
    }
}
