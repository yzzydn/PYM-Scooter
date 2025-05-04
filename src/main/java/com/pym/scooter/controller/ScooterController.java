package com.pym.scooter.controller;

import com.pym.scooter.model.Scooter;
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
}
