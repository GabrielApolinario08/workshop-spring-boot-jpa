package com.coursejava.project_spring.repositories;

import com.coursejava.project_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
