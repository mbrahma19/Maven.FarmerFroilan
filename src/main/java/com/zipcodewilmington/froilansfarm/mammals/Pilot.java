package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Pilot extends Mammal implements Rider, Eater {
    private  Boolean isCurrentlyRiding;
    private Rideable currentTransportation;
    private Farm farm ;


    public Pilot(){
        isCurrentlyRiding = false;
        currentTransportation = null;
        farm = Farm.getFarm();
    }

    public String noise() {

        return "CHHH, Attention passengers we may experience some turbulence CHHH";
    }

    public void mount(Rideable entity) {

        if(entity.getRideStatus() != false && isCurrentlyRiding != true){
                entity.setRideStatus(true);
                isCurrentlyRiding = false;
                currentTransportation = entity;
          } else{
              dismount(entity);
          }
    }

    public void dismount(Rideable entity) {

    }

    public Boolean getCurrentlyRiding() {
        return isCurrentlyRiding;
    }


    public Rideable getCurrentTransportation() {
        return currentTransportation;
    }

}
