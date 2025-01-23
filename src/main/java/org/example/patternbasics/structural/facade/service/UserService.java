package org.example.patternbasics.structural.facade.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.patternbasics.structural.facade.model.User;
import org.example.patternbasics.structural.facade.repository.UserRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {
    UserRepository userRepository;

    // Simulates database operations
    public User createUser(User user) {
        return userRepository.save(user);
    }

}
