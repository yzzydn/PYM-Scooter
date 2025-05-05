package com.pym.scooter;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.model.ScooterType;
import com.pym.scooter.model.Station;
import com.pym.scooter.repository.ScooterRepository;
import com.pym.scooter.repository.StationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class ScooterApplication {

    @Autowired
    private StationRepository stationRepository;

    @Autowired
    private ScooterRepository scooterRepository;

    public static void main(String[] args) {
        SpringApplication.run(ScooterApplication.class, args);
    }

    @PostConstruct
    public void initData() {
        createStationWithScooters("Basel SBB");
        createStationWithScooters("Basel Badischer Bahnhof");
        createStationWithScooters("Basel Bankveria");
        createStationWithScooters("Basel Claraplatz");
    }

    private void createStationWithScooters(String name) {
        Station station = new Station(name);
        stationRepository.save(station);

        List<Scooter> scooters = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scooter shortScooter = new Scooter();
            shortScooter.setType(ScooterType.SHORT_DISTANCE);
            shortScooter.setStation(station);
            scooters.add(shortScooter);

            Scooter longScooter = new Scooter();
            longScooter.setType(ScooterType.LONG_DISTANCE);
            longScooter.setStation(station);
            scooters.add(longScooter);
        }

        scooterRepository.saveAll(scooters);
    }
}
