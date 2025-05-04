package com.pym.scooter;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.model.Station;
import com.pym.scooter.repository.ScooterRepository;
import com.pym.scooter.repository.StationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final ScooterRepository scooterRepository;
    private final StationRepository stationRepository;

    public DatabaseInitializer(ScooterRepository scooterRepository, StationRepository stationRepository) {
        this.scooterRepository = scooterRepository;
        this.stationRepository = stationRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("🚀 Loading test data...");

        Station stationA = new Station("Station A");
        Station stationB = new Station("Station B");

        stationRepository.save(stationA);
        stationRepository.save(stationB);

        for (int i = 1; i <= 5; i++) {
            scooterRepository.save(new Scooter("LD-A-" + i, "LongDistance", true, stationA));
            scooterRepository.save(new Scooter("SD-A-" + i, "ShortDistance", true, stationA));
            scooterRepository.save(new Scooter("LD-B-" + i, "LongDistance", true, stationB));
            scooterRepository.save(new Scooter("SD-B-" + i, "ShortDistance", true, stationB));
        }

        System.out.println("✅ Data loaded: 40 scooters across 2 stations.");
    }
}
