package com.pym.scooter.service;

import com.pym.scooter.model.Station;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationService {

    private final List<Station> stations = new ArrayList<>();

    public List<Station> getAllStations() {
        return stations;
    }
}
