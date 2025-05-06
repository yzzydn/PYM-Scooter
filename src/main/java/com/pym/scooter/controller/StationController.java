package com.pym.scooter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stations")
public class StationController {

    @GetMapping
    public List<String> getStations() {
        System.out.println("Stations endpoint called");
        return List.of("Station A", "Station B", "Station C");
    }
}