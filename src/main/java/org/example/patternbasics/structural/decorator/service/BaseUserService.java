package org.example.patternbasics.structural.decorator.service;

import org.example.patternbasics.structural.decorator.UserDto;
import org.example.patternbasics.structural.decorator.decoratorservice.UserService;
import org.springframework.stereotype.Service;

/**
 * Base implementation of UserService
 * Provides basic user data retrieval without additional functionality
 */
@Service
public class BaseUserService implements UserService {

    @Override
    public UserDto getUserData(Long userId) {
        // Simulates retrieving user data from a database or external service
        return new UserDto(userId, "John", "Doe", "john@example.com");
    }
}
