package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;
import com.zipcodewilmington.froilansfarm.crops.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

import java.util.ArrayList;
import java.util.List;

public abstract class Human extends Mammal implements Rider {

    private Boolean isCurrentlyRiding;
    private Rideable currentTransportation;

    public Human(){
        super();
        isCurrentlyRiding = false;
        currentTransportation = null;
    }

    public Boolean getCurrentlyRiding() {
        return isCurrentlyRiding;
    }

    public void setCurrentlyRiding(Boolean currentlyRiding) {
        isCurrentlyRiding = currentlyRiding;
    }

    public Rideable getCurrentTransportation() {
        return currentTransportation;
    }

    public void setCurrentTransportation(Rideable currentTransportation) {
        this.currentTransportation = currentTransportation;
    }

    public List<Egg> collectEggs(ChickenCoop cc){
        List<Egg> eggList = new ArrayList();
        for(Chicken c : cc.getList()){
            Egg e = c.yield();
            if(!e.getHasBeenFertilized()){
                eggList.add(e);
            }
        }
        return eggList;
    }

    public void mount(Rideable entity) {
        while (true) {
            if (entity.getRideStatus() && !getCurrentlyRiding()) {
                entity.setRideStatus(false);
                setCurrentlyRiding(true);
                setCurrentTransportation(entity);
                break;
            } else {
                dismount(entity);
            }
        }
    }

    public void dismount(Rideable entity) {
        entity.setRideStatus(true);
        setCurrentlyRiding(false);
        setCurrentTransportation(null);
    }
}
