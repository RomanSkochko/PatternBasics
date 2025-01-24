package org.example.patternbasics.behavioral.observer.notificationobserver;

import org.springframework.stereotype.Component;

// Concrete Observer: SMS Notification Receiver
@Component
class SMSNotificationObserver implements NotificationObserver {
    @Override
    public void update(String message) {
        // Simulate sending SMS notification
        System.out.println("SMS Notification: " + message);
    }
}
