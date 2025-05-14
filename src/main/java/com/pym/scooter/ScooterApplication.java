package com.pym.scooter;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.model.ScooterType;
import com.pym.scooter.model.Station;
import com.pym.scooter.repository.ScooterRepository;
import com.pym.scooter.repository.StationRepository;
import com.pym.scooter.service.UserService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = {
    "com.pym.scooter",
    "com.pym.scooter.service.security" // Add this line
})
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
    @Bean
CommandLineRunner initUsers(UserService userService) {
    return args -> {
        try {
            userService.createUser("admin", "adminpassword", "ADMIN");
            userService.createUser("user1", "password1", "USER");
            userService.createUser("user2", "password2", "USER");
        } catch (Exception e) {
            System.out.println("Users already initialized");
        }
    };
}

}