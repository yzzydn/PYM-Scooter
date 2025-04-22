package com.pym.scooter.controller;

import com.pym.scooter.model.*;
import com.pym.scooter.service.ScooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pym-scooter/scooters")
public class ScooterController {

    @Autowired
    private ScooterService scooterService;

    @GetMapping("/available")
    public ResponseEntity<List<Scooter>> getAvailable(@RequestParam String station) {
        return ResponseEntity.ok(scooterService.getAvailableScooters(station));
    }

    @PostMapping("/rent")
    public ResponseEntity<?> rentScooter(@RequestParam Long scooterId, @RequestParam String userName) {
        try {
            Rental rental = scooterService.rentScooter(scooterId, userName);
            return ResponseEntity.ok(rental);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/return")
    public ResponseEntity<?> returnScooter(@RequestParam Long rentalId) {
        try {
            Rental rental = scooterService.returnScooter(rentalId);
            return ResponseEntity.ok(rental);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/stations")
    public ResponseEntity<List<Station>> getStations() {
        return ResponseEntity.ok(scooterService.getAllStations());
    }
}

