package org.example.patternbasics.structural.facade.facade;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.patternbasics.structural.facade.model.User;
import org.example.patternbasics.structural.facade.service.NotificationService;
import org.example.patternbasics.structural.facade.service.UserService;
import org.example.patternbasics.structural.facade.service.ValidationService;
import org.springframework.stereotype.Service;

/**
 * Facade - Simplifies user registration process
 * provides a single, simplified interface to the more general facilities of a subsystem
 */
@RequiredArgsConstructor
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserRegistrationFacade {
    UserService userService;
    NotificationService notificationService;
    ValidationService validationService;

    // Simplified method that coordinates multiple subsystem operations
    public boolean registerUser(User user) {
        // Validate user
        if (!validationService.isValidUser(user)) {
            return false;
        }

        // Save user
        userService.createUser(user);

        // Send notification
        notificationService.sendWelcomeEmail(user);

        return true;
    }
}
