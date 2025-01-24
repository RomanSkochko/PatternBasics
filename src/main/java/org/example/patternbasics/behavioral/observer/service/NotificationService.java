package org.example.patternbasics.behavioral.observer.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.patternbasics.behavioral.observer.notificationobserver.NotificationObserver;
import org.example.patternbasics.behavioral.observer.notificationobserver.NotificationSubject;
import org.springframework.stereotype.Service;

import java.util.List;

// Concrete implementation of the Subject (Observable)
@RequiredArgsConstructor
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class NotificationService implements NotificationSubject {
    List<NotificationObserver> observers;

    @Override
    public void registerObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        // Notify all registered observers with the message
        for (NotificationObserver observer : observers) {
            observer.update(message);
        }
    }

    // Method to simulate sending a notification
    public void sendNotification(String message) {
        // Broadcast message to all registered observers
        notifyObservers(message);
    }
}
