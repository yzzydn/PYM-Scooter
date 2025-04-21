package com.pym.scooter.repository;

import com.pym.scooter.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Long> {}
