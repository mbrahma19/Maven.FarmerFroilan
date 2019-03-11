package com.zipcodewilmington.froilansfarm.transportation;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.List;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {

    Boolean isFlying;

    public CropDuster(){
        super();
        isFlying = false;
    }

    public void fly() {
        isFlying = true;
    }

    public void land(){
        isFlying = false;
    }

    public void operate(Farm farm) {
        fly();
        List<CropRow> field = farm.getCropField().getList();
        for (CropRow cropRow : field) {
            cropRow.fertilizeCropRow();
        }
        land();
    }

    public String noise() {
        return "flying noises";
    }

    public Boolean getFlying() {
        return isFlying;
    }

}
