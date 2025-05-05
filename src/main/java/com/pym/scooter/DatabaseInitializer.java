package com.pym.scooter;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.model.ScooterType;
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

        Station claraplatz = new Station("Claraplatz", null, null);
        Station bankveria = new Station("Bankveria", null, null);
        Station sbb = new Station("Sbb", null, null);
        Station badishen = new Station("Badishen Bahnhof", null, null);

        stationRepository.save(claraplatz);
        stationRepository.save(bankveria);
        stationRepository.save(sbb);
        stationRepository.save(badishen);

        for (int i = 1; i <= 5; i++) {
            scooterRepository.save(new Scooter(ScooterType.LONG_DISTANCE, true, claraplatz));
            scooterRepository.save(new Scooter(ScooterType.SHORT_DISTANCE, true, claraplatz));

            scooterRepository.save(new Scooter(ScooterType.LONG_DISTANCE, true, bankveria));
            scooterRepository.save(new Scooter(ScooterType.SHORT_DISTANCE, true, bankveria));

            scooterRepository.save(new Scooter(ScooterType.LONG_DISTANCE, true, sbb));
            scooterRepository.save(new Scooter(ScooterType.SHORT_DISTANCE, true, sbb));

            scooterRepository.save(new Scooter(ScooterType.LONG_DISTANCE, true, badishen));
            scooterRepository.save(new Scooter(ScooterType.SHORT_DISTANCE, true, badishen));
        }

        System.out.println("✅ Loaded 40 scooters across 4 pickup/dropoff stations.");
    }
}
