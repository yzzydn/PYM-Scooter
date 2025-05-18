package com.pym.scooter.service;

import com.pym.scooter.model.*;
import com.pym.scooter.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScooterRepository scooterRepository;


    public Booking createBooking(Station pickup, Station dropoff, ScooterType scooterType, Long userId) {
        // Find user
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Find available scooter
        List<Scooter> scooters = scooterRepository.findAll();
        Scooter availableScooter = scooters.stream()
                .filter(s -> s.getScooterType() == scooterType && s.getStation().getId().equals(pickup.getId()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No available scooter of type " + scooterType));

        // Create booking
        Booking booking = new Booking();
        booking.setUser(user);
        booking.setPickupStation(pickup);
        booking.setDropoffStation(dropoff);
        booking.setScooter(availableScooter);
        booking.setStartTime(LocalDateTime.now());
        booking.setEndTime(LocalDateTime.now().plusMinutes(30));

        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public List<Booking> getUserBookings(String username) {
        return bookingRepository.findByUserUsername(username);
    }
}
