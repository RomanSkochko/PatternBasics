package org.example.patternbasics.structural.decorator.decoratorservice;

import org.example.patternbasics.structural.decorator.UserDto;

/**
 * Service interface for user-related operations
 * Defines the contract for retrieving user data
 */
public interface UserService {
    UserDto getUserData(Long userId);
}
