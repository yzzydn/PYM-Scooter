package com.pym.scooter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Hidden;

@RestController
@Hidden
public class WelcomeController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to PYM Scooter Rental!";
    }
}