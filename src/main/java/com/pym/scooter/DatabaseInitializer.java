package com.pym.scooter;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.model.ScooterType;
import com.pym.scooter.repository.ScooterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final ScooterRepository scooterRepository;

    public DatabaseInitializer(ScooterRepository scooterRepository) {
        this.scooterRepository = scooterRepository;
    }

    @Override
    public void run(String... args) {
        Scooter shortDistance = new Scooter();
        shortDistance.setType(ScooterType.SHORT_DISTANCE);

        Scooter longDistance = new Scooter();
        longDistance.setType(ScooterType.LONG_DISTANCE);

        scooterRepository.save(shortDistance);
        scooterRepository.save(longDistance);
    }
}
