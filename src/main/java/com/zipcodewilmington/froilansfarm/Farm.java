package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.containers.*;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.List;

public class Farm {

    private List<Stable> stableList;
    private List<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;
    private Field cropField;
    private FarmVehicle vehicle1;
    private FarmVehicle vehicle2;
    private Aircraft aircraft;

    public Farm(List<Stable> stableList, List<ChickenCoop> chickenCoops, FarmHouse farmHouse, Field cropField, FarmVehicle vehicle1, FarmVehicle vehicle2, Aircraft aircraft) {
        this.stableList = stableList;
        this.chickenCoops = chickenCoops;
        this.farmHouse = farmHouse;
        this.cropField = cropField;
        this.vehicle1 = vehicle1;
        this.vehicle2 = vehicle2;
        this.aircraft = aircraft;
    }


}
