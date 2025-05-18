package com.pym.scooter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "scooter_id")
    private Scooter scooter;

    @ManyToOne
    @JoinColumn(name = "pickup_station_id")
    private Station pickupStation;

    @ManyToOne
    @JoinColumn(name = "dropoff_station_id")
    private Station dropoffStation;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Booking() {}

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Scooter getScooter() {
        return scooter;
    }

    public void setScooter(Scooter scooter) {
        this.scooter = scooter;
    }

    public Station getPickupStation() {
        return pickupStation;
    }

    public void setPickupStation(Station pickupStation) {
        this.pickupStation = pickupStation;
    }

    public Station getDropoffStation() {
        return dropoffStation;
    }

    public void setDropoffStation(Station dropoffStation) {
        this.dropoffStation = dropoffStation;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
