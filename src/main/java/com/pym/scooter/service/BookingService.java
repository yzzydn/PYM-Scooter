package com.pym.scooter.service;

import com.pym.scooter.model.Booking;
import com.pym.scooter.model.Station;
import com.pym.scooter.model.ScooterType;
import com.pym.scooter.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking(Station pickupStation, Station dropoffStation, ScooterType scooterType, String username) {
        Booking booking = new Booking(pickupStation, dropoffStation, scooterType, username);
        return bookingRepository.save(booking);
    }

    public List<Booking> getUserBookings(String username) {
        return bookingRepository.findByUsername(username);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}