package com.pym.scooter.service;

import com.pym.scooter.model.Rental;
import com.pym.scooter.model.Scooter;
import com.pym.scooter.repository.RentalRepository;
import com.pym.scooter.repository.ScooterRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class RentService {

    private final RentalRepository rentalRepository;
    private final ScooterRepository scooterRepository;

    public RentService(RentalRepository rentalRepository, ScooterRepository scooterRepository) {
        this.rentalRepository = rentalRepository;
        this.scooterRepository = scooterRepository;
    }

    public Rental startRental(Long scooterId, String userName) {
        Optional<Scooter> optionalScooter = scooterRepository.findById(scooterId);
        if (optionalScooter.isEmpty()) {
            throw new IllegalArgumentException("Scooter not found");
        }

        Scooter scooter = optionalScooter.get();
        Rental rental = new Rental(userName, true, LocalDateTime.now(), null, scooter);
        return rentalRepository.save(rental);
    }

    public Rental endRental(Long rentalId) {
        Optional<Rental> optionalRental = rentalRepository.findById(rentalId);
        if (optionalRental.isEmpty()) {
            throw new IllegalArgumentException("Rental not found");
        }

        Rental rental = optionalRental.get();
        rental.setActive(false);
        rental.setEndTime(LocalDateTime.now());
        return rentalRepository.save(rental);
    }

    public List<Rental> getAllRentals() {
        return rentalRepository.findAll();
    }
}
