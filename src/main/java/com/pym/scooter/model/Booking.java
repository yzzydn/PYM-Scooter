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
    @JoinColumn(name = "pickup_station_id")
    private Station pickupStation;

    @ManyToOne
    @JoinColumn(name = "dropoff_station_id")
    private Station dropoffStation;

    @Enumerated(EnumType.STRING)
    @Column(name = "scooter_type")
    private ScooterType scooterType;

    @Column(name = "booking_time")
    private LocalDateTime bookingTime;

    @Column(name = "username")
    private String username;

    // Default constructor
    public Booking() {
        this.bookingTime = LocalDateTime.now();
    }

    // Parameterized constructor
    public Booking(Station pickupStation, Station dropoffStation, ScooterType scooterType, String username) {
        this.pickupStation = pickupStation;
        this.dropoffStation = dropoffStation;
        this.scooterType = scooterType;
        this.username = username;
        this.bookingTime = LocalDateTime.now();
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public ScooterType getScooterType() {
        return scooterType;
    }

    public void setScooterType(ScooterType scooterType) {
        this.scooterType = scooterType;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // toString method for debugging/logging
    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", pickupStation=" + pickupStation.getName() +
                ", dropoffStation=" + dropoffStation.getName() +
                ", scooterType=" + scooterType +
                ", bookingTime=" + bookingTime +
                ", username='" + username + '\'' +
                '}';
    }
}