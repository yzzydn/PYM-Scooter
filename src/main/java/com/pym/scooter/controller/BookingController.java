package com.pym.scooter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    @PostMapping
    public ResponseEntity<String> bookScooter(
            @RequestParam String pickupStation,
            @RequestParam String dropoffStation,
            @RequestParam String scooterType) {
        // Logic for booking a scooter
        String response = String.format("Scooter of type '%s' booked from '%s' to '%s'.",
                scooterType, pickupStation, dropoffStation);
        return ResponseEntity.ok(response);
    }
}