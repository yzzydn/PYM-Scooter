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

@SpringBootApplication
public class ScooterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScooterApplication.class, args);
    }

    @Bean
public CommandLineRunner dataLoader(StationRepository stationRepository, ScooterRepository scooterRepository) {
    return args -> {
        Station sbb = new Station(1L, "Basel SBB", 47.547, 7.589);
        Station badischer = new Station(2L, "Basel Badischer Bahnhof", 47.576, 7.609);
        Station bankveria = new Station(3L, "Basel Bankveria", 47.561, 7.597);
        Station claraplatz = new Station(4L, "Basel Claraplatz", 47.562, 7.600);

        stationRepository.save(sbb);
        stationRepository.save(badischer);
        stationRepository.save(bankveria);
        stationRepository.save(claraplatz);

        scooterRepository.save(new Scooter(ScooterType.LONG_DISTANCE, sbb));
        scooterRepository.save(new Scooter(ScooterType.SHORT_DISTANCE, badischer));
        scooterRepository.save(new Scooter(ScooterType.LONG_DISTANCE, claraplatz));
    };
}

}
