package com.pym.scooter.repository;

import com.pym.scooter.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {}
