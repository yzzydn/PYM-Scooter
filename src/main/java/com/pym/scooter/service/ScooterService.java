package com.pym.scooter.service;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.repository.ScooterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScooterService {

    @Autowired
    private ScooterRepository scooterRepository;

    public List<Scooter> getAllScooters() {
        return scooterRepository.findAll();
    }
}
