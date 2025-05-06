package com.pym.scooter.controller;

import com.pym.scooter.model.Station;
import com.pym.scooter.repository.StationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StationController {

    private final StationRepository stationRepository;

    public StationController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @GetMapping("/stations")
    public List<Station> getAllStations() {
        return stationRepository.findAll();
    }
}