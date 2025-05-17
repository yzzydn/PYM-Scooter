package com.pym.scooter.service;

import com.pym.scooter.model.Scooter;
import com.pym.scooter.model.Station;
import com.pym.scooter.repository.ScooterRepository;
import com.pym.scooter.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScooterService {

    @Autowired
    private ScooterRepository scooterRepository;

    @Autowired
    private StationRepository stationRepository;

    public Scooter createScooter(Scooter scooter) {
        // Attach existing station
        Long stationId = scooter.getStation().getId();
        Station station = stationRepository.findById(stationId)
            .orElseThrow(() -> new RuntimeException("Station not found"));

        scooter.setStation(station);
        return scooterRepository.save(scooter);
    }
}
