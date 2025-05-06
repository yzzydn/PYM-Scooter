package com.pym.scooter.model;

import jakarta.persistence.*;

@Entity
public class Scooter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ScooterType type;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    public Scooter() {}

    public Scooter(ScooterType type, Station station) {
        this.type = type;
        this.station = station;
    }

    public Long getId() { return id; }
    public ScooterType getType() { return type; }
    public void setType(ScooterType type) { this.type = type; }

    public Station getStation() { return station; }
    public void setStation(Station station) { this.station = station; }
}