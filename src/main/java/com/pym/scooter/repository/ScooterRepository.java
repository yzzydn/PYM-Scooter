package com.pym.scooter.repository;

import com.pym.scooter.model.Scooter;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ScooterRepository extends JpaRepository<Scooter, Long> {
    List<Scooter> findByAvailableTrueAndStation_Name(String stationName);
}
