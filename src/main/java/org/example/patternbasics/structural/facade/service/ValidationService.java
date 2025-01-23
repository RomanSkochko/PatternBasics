package org.example.patternbasics.structural.facade.service;

import org.example.patternbasics.structural.facade.model.User;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {

    // Validates user data
    public boolean isValidUser(User user) {
        return user.getEmail() != null && !user.getEmail().isEmpty();
    }
}
