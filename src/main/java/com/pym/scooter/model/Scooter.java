package com.pym.scooter.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Scooter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ScooterType type;

    private boolean available;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    @OneToMany(mappedBy = "scooter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rental> rentals = new ArrayList<>();

    // Constructors
    public Scooter() {}

    public Scooter(ScooterType type, boolean available, Station station) {
        this.type = type;
        this.available = available;
        this.station = station;
    }

    // Getters and setters
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

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
        rental.setScooter(this);
    }

    public void removeRental(Rental rental) {
        rentals.remove(rental);
        rental.setScooter(null);
    }
}
