package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.transportation.Tractor;

import java.util.List;

public class Farmer extends Mammal implements Rider, Eater, Botanist {

    private  Boolean isCurrentlyRiding;
    private Rideable currentTransportation;
    public Farmer(){
        super();
        isCurrentlyRiding = false;
        currentTransportation = null;
    }

    public void eat(Edible edibleFood) {
        super.addCalories(edibleFood.getCalories());
    }

    public String noise() {
        return "This is starting to get weird...";
    }

    public void plant(Crop cropToPlant,int index) {
        Farm farm = Farm.getFarm();
        farm.getCropField().getCropRow(index).add(cropToPlant);
    }

    public List<Edible> harvest(Tractor tractor){
        mount(tractor);
        tractor.operate(Farm.getFarm());
        dismount(tractor);
        return tractor.getTractorBin();
    }

    public void mount(Rideable entity) {
        while(true) {
            if (entity.getRideStatus() == true && isCurrentlyRiding == false) {
                entity.setRideStatus(false);
                isCurrentlyRiding = true;
                currentTransportation = entity;
                break;
            }
            else {
                dismount(entity);
            }
        }

    }

    public void dismount(Rideable entity) {
        entity.setRideStatus(true);
        isCurrentlyRiding = false;
        currentTransportation = null;
    }

    public Boolean getCurrentlyRiding() {
        return isCurrentlyRiding;
    }

    public Rideable getCurrentTransportation() {
        return currentTransportation;
    }


}
