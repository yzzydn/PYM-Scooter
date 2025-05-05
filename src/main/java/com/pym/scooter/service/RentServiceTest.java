package com.pym.scooter.service;

import com.pym.scooter.model.Rental;
import com.pym.scooter.model.Scooter;
import com.pym.scooter.model.ScooterType;
import com.pym.scooter.repository.RentalRepository;
import com.pym.scooter.repository.ScooterRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class RentServiceTest {

    @Autowired
    private RentService rentService;

    @Autowired
    private ScooterRepository scooterRepository;

    @Autowired
    private RentalRepository rentalRepository;

    private Scooter testScooter;

    @BeforeEach
    public void setUp() {
        rentalRepository.deleteAll();
        scooterRepository.deleteAll();

        testScooter = new Scooter();
        testScooter.setType(ScooterType.SHORT_DISTANCE);
        testScooter.setAvailable(true);
        scooterRepository.save(testScooter);
    }

    @Test
    public void testRentAndReturnScooter() {
        Rental rental = rentService.rentScooter(testScooter.getId());
        assertNotNull(rental);
        assertTrue(rental.isActive());
        assertEquals(testScooter.getId(), rental.getScooter().getId());

        Rental endedRental = rentService.returnScooter(rental.getId());
        assertFalse(endedRental.isActive());
    }
}
