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

    private final StationRepository stationRepository;
    private final ScooterRepository scooterRepository;

    public DatabaseInitializer(StationRepository stationRepository, ScooterRepository scooterRepository) {
        this.stationRepository = stationRepository;
        this.scooterRepository = scooterRepository;
    }

    @Override
    public void run(String... args) {
        // Create fixed stations
        Station sbb = new Station("Basel SBB", 47.5475, 7.5896);
        Station badischer = new Station("Basel Badischer Bahnhof", 47.5646, 7.6073);
        Station bankveria = new Station("Basel Bankveria", 47.5590, 7.5800);
        Station claraplatz = new Station("Basel Claraplatz", 47.5635, 7.5981);

        stationRepository.save(sbb);
        stationRepository.save(badischer);
        stationRepository.save(bankveria);
        stationRepository.save(claraplatz);

        // Add 10 scooters per station
        addScootersToStation(sbb);
        addScootersToStation(badischer);
        addScootersToStation(bankveria);
        addScootersToStation(claraplatz);
    }

    private void addScootersToStation(Station station) {
        for (int i = 0; i < 10; i++) {
            ScooterType type = (i % 2 == 0) ? ScooterType.LONG_DISTANCE : ScooterType.SHORT_DISTANCE;
            Scooter scooter = new Scooter(type, true, station);
            scooterRepository.save(scooter);
        }
    }
}
