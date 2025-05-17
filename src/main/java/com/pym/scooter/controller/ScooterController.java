package com.pym.scooter.controller;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.repository.ScooterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scooters")
public class ScooterController {

    @Autowired
    private ScooterRepository scooterRepository;

    // Create a new scooter
    @PostMapping
    public ResponseEntity<Scooter> createScooter(@RequestBody Scooter scooter) {
        return ResponseEntity.ok(scooterRepository.save(scooter));
    }

    // Get all scooters
    @GetMapping
    public ResponseEntity<List<Scooter>> getAllScooters() {
        return ResponseEntity.ok(scooterRepository.findAll());
    }
}
