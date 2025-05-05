package com.pym.scooter;

import com.pym.scooter.model.Station;
import com.pym.scooter.model.Scooter;
import com.pym.scooter.model.ScooterType;
import com.pym.scooter.repository.StationRepository;
import com.pym.scooter.repository.ScooterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final StationRepository stationRepository;
    private final ScooterRepository scooterRepository;

    public DatabaseInitializer(StationRepository stationRepository, ScooterRepository scooterRepository) {
        this.stationRepository = stationRepository;
        this.scooterRepository = scooterRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("🚀 Loading test data...");

        // Create stations
        Station s1 = new Station("Claraplatz");
        Station s2 = new Station("Bankveria");
        Station s3 = new Station("Sbb");
        Station s4 = new Station("Badishen Bahnhof");

        stationRepository.save(s1);
        stationRepository.save(s2);
        stationRepository.save(s3);
        stationRepository.save(s4);

        // Create scooters
        scooterRepository.save(new Scooter(ScooterType.SHORT_DISTANCE, true, s1));
        scooterRepository.save(new Scooter(ScooterType.SHORT_DISTANCE, true, s2));
        scooterRepository.save(new Scooter(ScooterType.LONG_DISTANCE, true, s3));
        scooterRepository.save(new Scooter(ScooterType.LONG_DISTANCE, true, s4));
    }
}
