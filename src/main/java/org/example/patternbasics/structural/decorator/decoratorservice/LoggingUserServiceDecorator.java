package org.example.patternbasics.structural.decorator.decoratorservice;

import org.example.patternbasics.structural.decorator.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logging decorator for UserService
 * Adds logging functionality to the base service implementation
 * Tracks method invocation time and logs request details
 */
public class LoggingUserServiceDecorator implements UserService {
    private final UserService userService;
    private final Logger log = LoggerFactory.getLogger(getClass());

    public LoggingUserServiceDecorator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDto getUserData(Long userId) {
        // Log the incoming request with user ID
        log.info("Retrieving user data for user ID: {}", userId);

        // Measure method execution time
        long start = System.currentTimeMillis();
        UserDto result = userService.getUserData(userId);
        long duration = System.currentTimeMillis() - start;

        // Log method execution details
        log.info("User data retrieved in {} ms", duration);
        return result;
    }
}
