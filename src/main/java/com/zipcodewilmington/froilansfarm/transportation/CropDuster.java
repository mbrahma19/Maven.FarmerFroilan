package com.zipcodewilmington.froilansfarm.transportation;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.containers.Field;

import java.util.List;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {

    Boolean isFlying;

    public void fly() {

    }

    public void operate(Farm farm) {
        List<CropRow> field = farm.getCropField().getList();
        for(CropRow cropRow : field ){
            cropRow.fertilizeCropRow();
        }
    }

    public String noise() {
        return "flying noises";
    }



    public Boolean getFlying() {
        return isFlying;
    }

    public void setFlying(Boolean flying) {
        isFlying = flying;
    }

}
