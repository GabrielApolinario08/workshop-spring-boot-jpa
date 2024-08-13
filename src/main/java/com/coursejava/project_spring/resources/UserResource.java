package com.coursejava.project_spring.resources;

import com.coursejava.project_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Gabriel", "gabriel@gmail.com", "12996396921", "senha123");
        return ResponseEntity.ok().body(user);
    }
}
