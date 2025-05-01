package com.pym.scooter;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.model.ScooterType;
import com.pym.scooter.model.Station;
import com.pym.scooter.repository.ScooterRepository;
import com.pym.scooter.repository.StationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ScooterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScooterApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(StationRepository stationRepo, ScooterRepository scooterRepo) {
        return args -> {
            System.out.println("🚀 Running data loader...");

            Station s1 = new Station(1L, "Basel SBB", 47.547, 7.589);
            Station s2 = new Station(2L, "Basel Badischer Bahnhof", 47.576, 7.609);
            Station s3 = new Station(3L, "Basel Bankveria", 47.561, 7.597);
            Station s4 = new Station(4L, "Basel Claraplatz", 47.562, 7.600);

            stationRepo.saveAll(List.of(s1, s2, s3, s4));

            List<Station> stations = List.of(s1, s2, s3, s4);
            for (Station station : stations) {
                for (int i = 0; i < 5; i++) {
                    scooterRepo.save(new Scooter(ScooterType.LONG_DISTANCE, station));
                    scooterRepo.save(new Scooter(ScooterType.SHORT_DISTANCE, station));
                }
            }

            System.out.println("✅ Finished loading 40 scooters.");
        };
    }
}
