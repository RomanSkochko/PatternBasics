package org.example.patternbasics.structural.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Data Transfer Object for user information
 * Encapsulates user details for API communication
 */

@Data
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
