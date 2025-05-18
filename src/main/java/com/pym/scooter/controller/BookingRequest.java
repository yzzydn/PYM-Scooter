package com.pym.scooter.controller;

import com.pym.scooter.model.ScooterType;
import java.time.LocalDateTime;

public class BookingRequest {
    private Long userId;
    private Long scooterId;
    private Long pickupStationId;
    private Long dropoffStationId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private ScooterType scooterType;

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Long getScooterId() { return scooterId; }
    public void setScooterId(Long scooterId) { this.scooterId = scooterId; }

    public Long getPickupStationId() { return pickupStationId; }
    public void setPickupStationId(Long pickupStationId) { this.pickupStationId = pickupStationId; }

    public Long getDropoffStationId() { return dropoffStationId; }
    public void setDropoffStationId(Long dropoffStationId) { this.dropoffStationId = dropoffStationId; }

    public LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }

    public LocalDateTime getEndTime() { return endTime; }
    public void setEndTime(LocalDateTime endTime) { this.endTime = endTime; }

    public ScooterType getScooterType() { return scooterType; }
    public void setScooterType(ScooterType scooterType) { this.scooterType = scooterType; }
}
