package com.pym.scooter.service;

import com.pym.scooter.model.Ride;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RideService {

    private final List<Ride> rides = new ArrayList<>();

    public Ride createRide(Long pickupStationId, Long dropoffStationId, String scooterType) {
        Ride ride = new Ride();
        ride.setPickupStationId(pickupStationId);
        ride.setDropoffStationId(dropoffStationId);
        ride.setScooterType(scooterType);
        rides.add(ride);
        return ride;
    }
}
