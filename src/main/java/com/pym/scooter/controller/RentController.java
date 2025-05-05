package com.pym.scooter.controller;

import com.pym.scooter.model.Rental;
import com.pym.scooter.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rent")
public class RentController {

    @Autowired
    private RentService rentService;

    @PostMapping("/{scooterId}")
    public Rental rentScooter(@PathVariable Long scooterId) {
        return rentService.rentScooter(scooterId);
    }

    @PostMapping("/return/{rentalId}")
    public Rental returnScooter(@PathVariable Long rentalId) {
        return rentService.returnScooter(rentalId);
    }
}
