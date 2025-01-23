package org.example.patternbasics.structural.decorator.decoratorservice;

import org.example.patternbasics.structural.decorator.service.BaseUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for setting up decorated UserService
 * Demonstrates how to apply the Decorator pattern
 */
@Configuration
public class UserServiceDecoratorConfig {
    @Bean
    public UserService userService(BaseUserService baseService) {
        // Wrap base service with logging decorator
        return new LoggingUserServiceDecorator(baseService);
    }
}