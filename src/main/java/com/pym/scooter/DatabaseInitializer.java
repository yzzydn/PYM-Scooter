package com.pym.scooter;

import com.pym.scooter.model.*;
import com.pym.scooter.repository.RentalRepository;
import com.pym.scooter.repository.ScooterRepository;
import com.pym.scooter.repository.StationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final StationRepository stationRepository;
    private final ScooterRepository scooterRepository;
    private final RentalRepository rentalRepository;

    public DatabaseInitializer(StationRepository stationRepository,
                               ScooterRepository scooterRepository,
                               RentalRepository rentalRepository) {
        this.stationRepository = stationRepository;
        this.scooterRepository = scooterRepository;
        this.rentalRepository = rentalRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("🚀 Loading test data...");

        Station station1 = new Station("Central Station");
        Station station2 = new Station("North Station");
        stationRepository.saveAll(List.of(station1, station2));

        Scooter scooter1 = new Scooter(ScooterType.SHORT_DISTANCE, true, station1);
        Scooter scooter2 = new Scooter(ScooterType.LONG_DISTANCE, true, station2);
        scooterRepository.saveAll(List.of(scooter1, scooter2));

        Rental rental1 = new Rental("john", true, LocalDateTime.now().minusHours(1), null, scooter1);
        Rental rental2 = new Rental("alice", true, LocalDateTime.now().minusMinutes(30), null, scooter2);
        rentalRepository.saveAll(List.of(rental1, rental2));
    }
}
