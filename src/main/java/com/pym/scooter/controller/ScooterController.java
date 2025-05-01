package com.pym.scooter.controller;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.model.Rental;
import com.pym.scooter.model.Station;
import com.pym.scooter.service.ScooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scooters")
public class ScooterController {

    @Autowired
    private ScooterService scooterService;

    @GetMapping
    public List<Scooter> getAllScooters() {
        return scooterService.getAllScooters();
    }

    @PostMapping("/rent")
    public Rental rentScooter(@RequestParam Long scooterId, @RequestParam String username) {
        return scooterService.rentScooter(scooterId, username);
    }

    @PostMapping("/return")
    public Rental returnScooter(@RequestParam Long scooterId, @RequestParam String username) {
        return scooterService.returnScooter(scooterId, username);
    }

    @GetMapping("/stations")
    public List<Station> getStations() {
        return scooterService.getStations();
    }

    // ✅ NEW: debug endpoint
    @GetMapping("/debug")
    public String debugScooterCount() {
        int count = scooterService.getAllScooters().size();
        return "🚨 Total scooters in DB: " + count;
    }
}
