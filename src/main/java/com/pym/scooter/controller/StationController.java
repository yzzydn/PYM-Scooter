package com.pym.scooter.controller;

import com.pym.scooter.model.Station;
import com.pym.scooter.service.StationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stations")
public class StationController {

    private final StationService stationService;

    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping
    public List<Station> getAllStations() {
        return stationService.getAllStations();
    }
}
