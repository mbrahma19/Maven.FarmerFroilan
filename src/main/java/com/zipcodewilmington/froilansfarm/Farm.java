package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.containers.*;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.transportation.CropDuster;
import com.zipcodewilmington.froilansfarm.transportation.Tractor;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private static final Farm farm = new Farm();

    private List<Stable> stableList;
    private List<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;
    private Field cropField;
    private FarmVehicle vehicle1;
    private FarmVehicle vehicle2;
    private Aircraft aircraft;

    private Farm() {
        this.stableList = new ArrayList<>();
        this.chickenCoops = new ArrayList<>();
        this.farmHouse = new FarmHouse();
        this.cropField = new Field();
        this.vehicle1 = new Tractor();
        this.vehicle2 = new Tractor();
        this.aircraft = new CropDuster();
    }

    public static Farm getFarm(){
        return farm;
    }

    public List<Stable> getStableList() {
        return stableList;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public Field getCropField() {
        return cropField;
    }

    public FarmVehicle getVehicle1() {
        return vehicle1;
    }

    public FarmVehicle getVehicle2() {
        return vehicle2;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }


}
