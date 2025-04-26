package com.pym.scooter.service;

import com.pym.scooter.model.Rental;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentService {

    private final List<Rental> rentals = new ArrayList<>();

    public Rental rentScooter(Long scooterId, String username) {
        Rental rental = new Rental();
        rental.setScooterId(scooterId);
        rental.setUserName(username);
        rental.setActive(true);
        rentals.add(rental);
        return rental;
    }

    public Rental returnScooter(Long scooterId) {
        for (Rental rental : rentals) {
            if (rental.getScooterId().equals(scooterId) && rental.isActive()) {
                rental.setActive(false);
                return rental;
            }
        }
        return null;
    }
}
