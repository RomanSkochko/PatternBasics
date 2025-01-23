package org.example.patternbasics.structural.decorator.controller;

import org.example.patternbasics.structural.decorator.UserDto;
import org.example.patternbasics.structural.decorator.decoratorservice.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * V2 Controller with logging decorator
 * Represents an API version with enhanced logging capabilities
 */
@RestController
@RequestMapping("/v2/users")
public class UserControllerV2 {
    private final UserService userService;

    public UserControllerV2(UserService userService) {
        this.userService = userService;
    }

    /**
     * Retrieves user profile data by user ID
     * @param userId Unique identifier of the user
     * @return ResponseEntity containing user profile data
     */
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserProfile(@PathVariable Long userId) {
        UserDto userData = userService.getUserData(userId);
        return ResponseEntity.ok(userData);
    }
}
