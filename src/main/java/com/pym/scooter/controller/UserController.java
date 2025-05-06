package com.pym.scooter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/user")
    public String userAccess() {
        return "Welcome, User!";
    }

    @GetMapping("/admin")
    public String adminAccess() {
        return "Welcome, Admin!";
    }
}