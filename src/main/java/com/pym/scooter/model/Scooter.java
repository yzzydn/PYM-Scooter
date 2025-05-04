package com.pym.scooter.model;

import jakarta.persistence.*;

@Entity
public class Scooter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private String type;
    private boolean available;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    // Constructors
    public Scooter() {
    }

    public Scooter(String model, String type, boolean available, Station station) {
        this.model = model;
        this.type = type;
        this.available = available;
        this.station = station;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }
}
