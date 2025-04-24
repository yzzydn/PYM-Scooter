package com.pym.scooter;

import com.pym.scooter.model.Station;
import com.pym.scooter.repository.StationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScooterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScooterApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(StationRepository stationRepository) {
        return (args) -> {
            // Delete all existing stations (optional but ensures clean slate)
            stationRepository.deleteAll();

            // Insert all 4 required stations
            stationRepository.save(new Station("Basel SBB", "Central Basel"));
            stationRepository.save(new Station("Basel Badischer Bahnhof", "North Basel"));
            stationRepository.save(new Station("Basel Claraplatz", "East Basel"));
            stationRepository.save(new Station("Basel Bankveria", "Banking district"));
        };
    }
}
