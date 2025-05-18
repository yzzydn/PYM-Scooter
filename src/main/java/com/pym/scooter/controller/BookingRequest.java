package com.pym.scooter.controller;

import com.pym.scooter.model.ScooterType;

public class BookingRequest {
    private Long userId;
    private Long pickupStationId;
    private Long dropoffStationId;
    private ScooterType scooterType;

    public Long getUserId() {
        return userId;
    }

    public Long getPickupStationId() {
        return pickupStationId;
    }

    public Long getDropoffStationId() {
        return dropoffStationId;
    }

    public ScooterType getScooterType() {
        return scooterType;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setPickupStationId(Long pickupStationId) {
        this.pickupStationId = pickupStationId;
    }

    public void setDropoffStationId(Long dropoffStationId) {
        this.dropoffStationId = dropoffStationId;
    }

    public void setScooterType(ScooterType scooterType) {
        this.scooterType = scooterType;
    }
}
