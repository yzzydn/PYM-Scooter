package com.pym.scooter.service;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.repository.ScooterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ScooterService {

    @Autowired
    private ScooterRepository scooterRepository;

    public List<Scooter> getAllScooters() {
        return StreamSupport.stream(scooterRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Scooter createScooter(Scooter scooter) {
        return scooterRepository.save(scooter);
    }
}
