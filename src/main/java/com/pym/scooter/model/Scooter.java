package com.pym.scooter.model;

import jakarta.persistence.*;

@Entity
public class Scooter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ScooterType type;

    private boolean available;
    private int batteryLevel;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    public Scooter() {}

    public Scooter(ScooterType type, boolean available, int batteryLevel, Station station) {
        this.type = type;
        this.available = available;
        this.batteryLevel = batteryLevel;
        this.station = station;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public ScooterType getType() {
        return type;
    }

    public void setType(ScooterType type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }
}
