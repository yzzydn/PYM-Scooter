package com.pym.scooter.service;

import com.pym.scooter.model.*;
import com.pym.scooter.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ScooterService {

    @Autowired
    private ScooterRepository scooterRepo;

    @Autowired
    private RentalRepository rentalRepo;

    @Autowired
    private StationRepository stationRepo;

    // List all available scooters at a given station
    public List<Scooter> getAvailableScooters(String stationName) {
        return scooterRepo.findByAvailableTrueAndStation_Name(stationName);
    }

    // User rents a scooter
    public Rental rentScooter(Long scooterId, String userName) throws Exception {
        Scooter scooter = scooterRepo.findById(scooterId)
                .orElseThrow(() -> new Exception("Scooter not found"));

        if (!scooter.isAvailable()) {
            throw new Exception("Scooter is already rented.");
        }

        scooter.setAvailable(false);
        scooterRepo.save(scooter);

        Rental rental = new Rental();
        rental.setUserName(userName);
        rental.setScooter(scooter);
        rental.setStartTime(LocalDateTime.now());

        return rentalRepo.save(rental);
    }

    // User returns a scooter
    public Rental returnScooter(Long rentalId) throws Exception {
        Rental rental = rentalRepo.findById(rentalId)
                .orElseThrow(() -> new Exception("Rental not found"));

        rental.setEndTime(LocalDateTime.now());

        Scooter scooter = rental.getScooter();
        scooter.setAvailable(true);
        scooterRepo.save(scooter);

        return rentalRepo.save(rental);
    }

    // Get all stations
    public List<Station> getAllStations() {
        return stationRepo.findAll();
    }
}
