package com.pym.scooter.service;

import com.pym.scooter.model.Station;
import com.pym.scooter.repository.StationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

     @Autowired
    private StationRepository stationRepository;
    
    public Station getStationById(Long id) {
        return stationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Station not found"));
    }

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public List<Station> getAllStations() {
        return stationRepository.findAll();
    }
}