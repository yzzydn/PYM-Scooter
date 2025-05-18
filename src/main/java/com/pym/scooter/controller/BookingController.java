package com.pym.scooter.controller;

import com.pym.scooter.model.Booking;
import com.pym.scooter.model.Station;
import com.pym.scooter.service.BookingService;
import com.pym.scooter.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings") // ✅ This must match your Postman URL
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private StationRepository stationRepository;

    // ✅ POST: Create a new booking
    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody BookingRequest request) {
        Station pickup = stationRepository.findById(request.getPickupStationId())
                .orElseThrow(() -> new RuntimeException("Pickup station not found"));

        Station dropoff = stationRepository.findById(request.getDropoffStationId())
                .orElseThrow(() -> new RuntimeException("Dropoff station not found"));

        Booking booking = bookingService.createBooking(
                pickup,
                dropoff,
                request.getScooterType(),
                request.getUserId()
        );

        return ResponseEntity.ok(booking);
    }

    // ✅ GET: List all bookings
    @GetMapping
    public ResponseEntity<List<Booking>> getAllBookings() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }
}
