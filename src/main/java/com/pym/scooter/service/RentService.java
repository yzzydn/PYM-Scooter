package com.pym.scooter.service;

import com.pym.scooter.model.Rental;
import com.pym.scooter.model.Scooter;
import com.pym.scooter.repository.RentalRepository;
import com.pym.scooter.repository.ScooterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentService {

    @Autowired
    private ScooterRepository scooterRepository;

    @Autowired
    private RentalRepository rentalRepository;

    public Rental rentScooter(Long scooterId) {
        Scooter scooter = scooterRepository.findById(scooterId).orElseThrow();
        Rental rental = new Rental(scooter);
        return rentalRepository.save(rental);
    }

    public Rental returnScooter(Long rentalId) {
        Rental rental = rentalRepository.findById(rentalId).orElseThrow();
        rental.setActive(false);
        return rentalRepository.save(rental);
    }
}
