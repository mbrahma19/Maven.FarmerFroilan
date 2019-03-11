package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Mammal implements Rideable {


    private Boolean rideStatus;
    private Integer dailyRides;

    public Horse() {
        super();
        rideStatus = true;
        dailyRides = 0;
    }


    public void eat(Edible edibleFood) {
        addCalories(edibleFood.getCalories());
    }

    public String noise() {
        return "neigh!";
    }

    public Boolean getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(Boolean b) {
        if(b){

        }
        this.rideStatus = b;

    }
}
