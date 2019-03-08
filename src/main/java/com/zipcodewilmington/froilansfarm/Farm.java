package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;
import com.zipcodewilmington.froilansfarm.containers.FarmHouse;
import com.zipcodewilmington.froilansfarm.containers.Field;
import com.zipcodewilmington.froilansfarm.containers.Stable;
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
}
