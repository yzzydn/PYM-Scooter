package com.pym.scooter;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.model.ScooterType;
import com.pym.scooter.model.Station;
import com.pym.scooter.repository.ScooterRepository;
import com.pym.scooter.repository.StationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScooterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScooterApplication.class, args);
    }

    CommandLineRunner initData(StationRepository stationRepository, ScooterRepository scooterRepository) {
        return args -> {
            List<Station> stations = List.of(
                new Station("Basel SBB"),
                new Station("Basel Badischer Bahnhof"),
                new Station("Basel Bankveria"),
                new Station("Basel Claraplatz")
            );

            for (Station station : stations) {
                List<Scooter> scooters = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    scooters.add(new Scooter(ScooterType.LONG_DISTANCE, station));
                    scooters.add(new Scooter(ScooterType.SHORT_DISTANCE, station));
                }
                station.setScooters(scooters);
                stationRepository.save(station);
            }
        };
    }
}