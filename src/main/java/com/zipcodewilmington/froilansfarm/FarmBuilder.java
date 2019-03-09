package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;
import com.zipcodewilmington.froilansfarm.containers.FarmHouse;
import com.zipcodewilmington.froilansfarm.containers.Field;
import com.zipcodewilmington.froilansfarm.containers.Stable;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.List;

public class FarmBuilder {
    private List<Stable> stableList;
    private List<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;
    private Field cropField;
    private FarmVehicle vehicle1;
    private FarmVehicle vehicle2;
    private Aircraft aircraft;

    public FarmBuilder setStableList(List<Stable> stableList) {
        this.stableList = stableList;
        return this;
    }

    public FarmBuilder setChickenCoops(List<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
        return this;
    }

    public FarmBuilder setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
        return this;
    }

    public FarmBuilder setCropField(Field cropField) {
        this.cropField = cropField;
        return this;
    }

    public FarmBuilder setVehicle1(FarmVehicle vehicle1) {
        this.vehicle1 = vehicle1;
        return this;
    }

    public FarmBuilder setVehicle2(FarmVehicle vehicle2) {
        this.vehicle2 = vehicle2;
        return this;
    }

    public FarmBuilder setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
        return this;
    }

    public Farm createFarm() {
        return new Farm(stableList, chickenCoops, farmHouse, cropField, vehicle1, vehicle2, aircraft);
    }
}