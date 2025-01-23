package org.example.patternbasics.structural.facade.service;

import org.example.patternbasics.structural.facade.model.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    // Simulates sending welcome notifications
    public void sendWelcomeEmail(User user) {
        System.out.println("Welcome email sent to " + user.getEmail());
    }
}
