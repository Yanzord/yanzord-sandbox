package com.yanzord.cloud.guicepetshop.domain.job;

import com.yanzord.cloud.guicepetshop.domain.Pet;

public class BathWithPerfume implements PetstoreJob {
    private final Double VALUE = 25.0;

    @Override
    public String execute(Pet pet) {
        return "Giving bath with perfume: " + pet.getName();
    }

    @Override
    public Double getValue() {
        return VALUE;
    }
}
