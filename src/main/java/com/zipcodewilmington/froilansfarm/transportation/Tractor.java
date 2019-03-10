package com.zipcodewilmington.froilansfarm.transportation;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

public class Tractor extends Vehicle implements FarmVehicle {

    private List<Edible> tractorBin;

    public Tractor(){
        super();
        tractorBin = new ArrayList<>();
    }

    public void operate(Farm farm) {
        List<CropRow> field = farm.getCropField().getList();
        for(CropRow cropRow: field){
            tractorBin.addAll(cropRow.harvestCropRow());
        }
    }
    public List<Edible> getTractorBin(){
        return tractorBin;
    }

    public String noise() {
        return "hissssssssss ssss ss";
    }

}
