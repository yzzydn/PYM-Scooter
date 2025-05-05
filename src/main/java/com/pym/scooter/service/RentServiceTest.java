package com.pym.scooter.service;

import com.pym.scooter.model.*;
import com.pym.scooter.repository.RentalRepository;
import com.pym.scooter.repository.ScooterRepository;
import com.pym.scooter.repository.StationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class RentServiceTest {

    @Autowired
    private RentService rentService;

    @Autowired
    private ScooterRepository scooterRepository;

    @Autowired
    private RentalRepository rentalRepository;

    @Autowired
    private StationRepository stationRepository;

    private Scooter testScooter;

    @BeforeEach
    public void setup() {
        rentalRepository.deleteAll();
        scooterRepository.deleteAll();
        stationRepository.deleteAll();

        Station station = new Station("Test Station");
        stationRepository.save(station);

        testScooter = new Scooter(ScooterType.SHORT_DISTANCE, true, station);
        scooterRepository.save(testScooter);
    }

    @Test
    public void testStartRental() {
        Rental rental = rentService.startRental(testScooter.getId(), "test_user");

        assertNotNull(rental.getId());
        assertEquals("test_user", rental.getUserName());
        assertTrue(rental.isActive());
        assertEquals(testScooter.getId(), rental.getScooter().getId());
    }
}
