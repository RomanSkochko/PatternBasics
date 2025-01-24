package org.example.patternbasics.behavioral.observer.notificationobserver;

// Define the Subject interface (Observable)
public interface NotificationSubject {
    void registerObserver(NotificationObserver observer);
    void removeObserver(NotificationObserver observer);
    void notifyObservers(String message);
}
