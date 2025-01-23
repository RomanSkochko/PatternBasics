package org.example.patternbasics.structural.facade.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.patternbasics.structural.facade.facade.UserRegistrationFacade;
import org.example.patternbasics.structural.facade.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// REST Controller using Facade
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
class UserController {
    UserRegistrationFacade userRegistrationFacade;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        boolean registrationSuccess = userRegistrationFacade.registerUser(user);

        return registrationSuccess
                ? ResponseEntity.ok("User registered successfully")
                : ResponseEntity.badRequest().body("Invalid user registration");
    }
}
