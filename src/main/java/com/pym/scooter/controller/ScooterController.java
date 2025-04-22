package com.pym.scooter.controller;

import com.pym.scooter.model.*;
import com.pym.scooter.service.ScooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pym-scooter/scooters")
public class ScooterController {

    @Autowired
    private ScooterService scooterService;

    // GET available scooters for a station
    @GetMapping("/available")
    public List<Scooter> getAvailable(@RequestParam String station) {
        return scooterService.getAvailableScooters(station);
    }

    // POST: rent a scooter
    @PostMapping("/rent")
    public ResponseEntity<?> rentScooter(@RequestParam Long scooterId, @RequestParam String userName) {
        try {
            Rental rental = scooterService.rentScooter(scooterId, userName);
            return ResponseEntity.ok(rental);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // POST: return a scooter
    @PostMapping("/return")
    public ResponseEntity<?> returnScooter(@RequestParam Long rentalId) {
        try {
            Rental rental = scooterService.returnScooter(rentalId);
            return ResponseEntity.ok(rental);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // GET all stations (for dropdowns etc.)
    @GetMapping("/stations")
    public List<Station> getStations() {
        return scooterService.getAllStations();
    }
}
