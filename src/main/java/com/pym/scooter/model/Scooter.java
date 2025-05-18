package com.pym.scooter.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Scooter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ScooterType scooterType; // changed from 'type' to 'scooterType'

    @ManyToOne
    @JoinColumn(name = "station_id")
    @JsonBackReference 
    private Station station;


    public Scooter() {}

    public Scooter(ScooterType scooterType, Station station) {
        this.scooterType = scooterType;
        this.station = station;
    }

    public Long getId() {
        return id;
    }

    public ScooterType getScooterType() {
        return scooterType;
    }

    public void setScooterType(ScooterType scooterType) {
        this.scooterType = scooterType;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }
}
