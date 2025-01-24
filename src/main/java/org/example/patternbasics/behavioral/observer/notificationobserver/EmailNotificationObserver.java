package org.example.patternbasics.behavioral.observer.notificationobserver;

import org.springframework.stereotype.Component;

// Concrete Observer: Email Notification Receiver
@Component
class EmailNotificationObserver implements NotificationObserver {
    @Override
    public void update(String message) {
        // Simulate sending email notification
        System.out.println("Email Notification: " + message);
    }
}
