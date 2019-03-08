package com.zipcodewilmington.froilansfarm.transportation;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {
    public void fly() {

    }

    public void operate(Farm farm) {

    }

    public String noise() {
        return null;
    }

    public void fertilize(CropRow row){

    }
}
