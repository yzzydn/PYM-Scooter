package com.pym.scooter.repository;

import com.pym.scooter.model.Scooter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScooterRepository extends CrudRepository<Scooter, Long> {
}
