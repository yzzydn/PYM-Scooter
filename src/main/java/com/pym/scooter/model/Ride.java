package com.pym.scooter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pickupStationId;
    private Long dropoffStationId;
    private String scooterType;

    public Ride() {}

    public Ride(Long pickupStationId, Long dropoffStationId, String scooterType) {
        this.pickupStationId = pickupStationId;
        this.dropoffStationId = dropoffStationId;
        this.scooterType = scooterType;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public Long getPickupStationId() {
        return pickupStationId;
    }

    public void setPickupStationId(Long pickupStationId) {
        this.pickupStationId = pickupStationId;
    }

    public Long getDropoffStationId() {
        return dropoffStationId;
    }

    public void setDropoffStationId(Long dropoffStationId) {
        this.dropoffStationId = dropoffStationId;
    }

    public String getScooterType() {
        return scooterType;
    }

    public void setScooterType(String scooterType) {
        this.scooterType = scooterType;
    }
}
