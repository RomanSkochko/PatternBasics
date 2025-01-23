package org.example.patternbasics.structural.facade.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    Long id;
    private String email;
}
