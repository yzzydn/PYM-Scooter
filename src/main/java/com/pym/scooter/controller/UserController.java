package com.pym.scooter.controller;

import com.pym.scooter.model.User;
import com.pym.scooter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Register a new user
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        user.setRole("USER"); // Default role
        return ResponseEntity.ok(userService.createUser(
            user.getUsername(),
            user.getPassword(),
            user.getRole()
        ));
    }

    // Get a user by username
    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        return ResponseEntity.ok(userService.findByUsername(username));
    }

    // Get all users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
