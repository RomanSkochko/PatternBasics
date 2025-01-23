package org.example.patternbasics.structural.facade.repository;

import org.example.patternbasics.structural.facade.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends JpaRepository<User, Long> {
}
