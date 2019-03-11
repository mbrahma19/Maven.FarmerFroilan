package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.crops.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.transportation.Tractor;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Human implements Botanist {

    public void eat(Edible edibleFood) {
        super.addCalories(edibleFood.getCalories());
    }

    public String noise() {
        return "This is starting to get weird...";
    }

    public void plant(Crop cropToPlant, int index) {
        Farm farm = Farm.getFarm();
        farm.getCropField().getCropRow(index).add(cropToPlant);
    }

    public List<Edible> harvest(Tractor tractor) {
        mount(tractor);
        tractor.operate(Farm.getFarm());
        dismount(tractor);
        return tractor.getTractorBin();
    }

}
