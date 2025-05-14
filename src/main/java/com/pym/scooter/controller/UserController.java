package com.pym.scooter.controller;

import com.pym.scooter.model.User;
import com.pym.scooter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam(defaultValue = "USER") String role) {
        
        User user = userService.createUser(username, password, role);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        return ResponseEntity.ok(userService.findByUsername(username));
    }
}