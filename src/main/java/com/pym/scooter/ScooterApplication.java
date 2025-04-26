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
    public CommandLineRunner dataLoader(StationRepository stationRepository) {
        return args -> {
            stationRepository.save(new Station(1L, "Central Park Station", 40.785091, -73.968285));
            stationRepository.save(new Station(2L, "Downtown Station", 40.712776, -74.005974));
            stationRepository.save(new Station(3L, "Uptown Station", 40.787011, -73.975368));
            stationRepository.save(new Station(4L, "Harbor Station", 40.700292, -74.012425));
        };
    }
}
