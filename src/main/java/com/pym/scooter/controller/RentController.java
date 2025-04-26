package com.pym.scooter.controller;

import com.pym.scooter.model.Rental;
import com.pym.scooter.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rentals")
public class RentController {

    @Autowired
    private RentService rentService;

    @PostMapping("/rent")
    public Rental rentScooter(@RequestParam Long scooterId, @RequestParam String username) {
        return rentService.rentScooter(scooterId, username);
    }

    @PostMapping("/return")
    public Rental returnScooter(@RequestParam Long scooterId) {
        return rentService.returnScooter(scooterId);
    }
}
