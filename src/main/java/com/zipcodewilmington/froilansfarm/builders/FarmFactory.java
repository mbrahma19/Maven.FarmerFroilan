package com.zipcodewilmington.froilansfarm.builders;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;
import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.Stable;

import java.util.stream.Stream;

public class FarmFactory {

    private Farm farm = Farm.getFarm();

    public FarmFactory addStables(Integer maxNumber){
         Stream.generate(Stable::new).limit(maxNumber).forEach(stable -> {
             farm.addStable(stable);
         });
         return this;
    }

    public FarmFactory addChickenCoops(Integer maxNumber){
        Stream.generate(ChickenCoop::new).limit(maxNumber).forEach(chickenCoop -> {
            farm.addChickenCoop(chickenCoop);
        });
        return this;
    }

    public FarmFactory addCropRows(Integer maxNumber){
        Stream.generate(CropRow::new).limit(maxNumber).forEach(croprow -> {
            farm.getCropField().add(croprow);
        });
        return this;
    }

}
