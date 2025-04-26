package com.pym.scooter.controller;

import com.pym.scooter.model.Ride;
import com.pym.scooter.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rides")
public class RideController {

    @Autowired
    private RideService rideService;

    @PostMapping("/create")
    public Ride createRide(@RequestParam Long pickupStationId, @RequestParam Long dropoffStationId, @RequestParam String scooterType) {
        return rideService.createRide(pickupStationId, dropoffStationId, scooterType);
    }
}
