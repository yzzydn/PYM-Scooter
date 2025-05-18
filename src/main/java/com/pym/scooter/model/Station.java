package com.pym.scooter.model;

import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "station", cascade = CascadeType.ALL)
    @JsonManagedReference 
    private List<Scooter> scooters;

    public Station() {}

    public Station(String name) {
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Scooter> getScooters() { return scooters; }
    public void setScooters(List<Scooter> scooters) { this.scooters = scooters; }
}