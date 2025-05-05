package com.pym.scooter.model;

public class Rental {
    private Long id;
    private Scooter scooter;
    private boolean active;

    public Rental() {}

    public Rental(Scooter scooter) {
        this.scooter = scooter;
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Scooter getScooter() {
        return scooter;
    }

    public void setScooter(Scooter scooter) {
        this.scooter = scooter;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
