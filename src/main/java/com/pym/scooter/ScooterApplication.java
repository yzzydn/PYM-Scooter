package com.pym.scooter;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.model.Station;
import com.pym.scooter.repository.ScooterRepository;
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
    public CommandLineRunner loadData(StationRepository stationRepository, ScooterRepository scooterRepository) {
        return (args) -> {
            System.out.println("🚀 Loading test data...");

            Station station1 = new Station(null, "Central Station", 40.7128, -74.0060);
            Station station2 = new Station(null, "West Side Station", 40.7306, -73.9352);

            stationRepository.save(station1);
            stationRepository.save(station2);

            Scooter scooter1 = new Scooter("ModelX", "LONG_DISTANCE", true, station1);
            Scooter scooter2 = new Scooter("ModelS", "SHORT_DISTANCE", true, station2);

            scooterRepository.save(scooter1);
            scooterRepository.save(scooter2);
        };
    }
}
