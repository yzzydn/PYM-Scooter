package com.pym.scooter.controller;

import com.pym.scooter.model.*;
import com.pym.scooter.service.BookingService;
import com.pym.scooter.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;
    
    @Autowired
    private StationService stationService;

    @PostMapping
public ResponseEntity<Booking> bookScooter(
        @RequestParam Long pickupStationId,
        @RequestParam Long dropoffStationId,
        @RequestParam ScooterType scooterType) {

    Station pickupStation = stationService.getStationById(pickupStationId);
    Station dropoffStation = stationService.getStationById(dropoffStationId);

    String username = "john_doe"; // 👈 hardcoded for dev

    Booking booking = bookingService.createBooking(
        pickupStation, 
        dropoffStation, 
        scooterType, 
        username
    );

    return ResponseEntity.ok(booking);
}


    @GetMapping("/my-bookings")
    public ResponseEntity<List<Booking>> getMyBookings(Authentication authentication) {
        return ResponseEntity.ok(bookingService.getUserBookings(authentication.getName()));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Booking>> getAllBookings() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }
}