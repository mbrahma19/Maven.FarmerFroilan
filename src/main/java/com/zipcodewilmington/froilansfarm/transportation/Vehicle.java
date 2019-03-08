package com.zipcodewilmington.froilansfarm.transportation;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {

    private Boolean rideStatus;

    public void setRideStatus(Boolean b) {
        rideStatus = b;
    }

    public Boolean getRideStatus() {
        return rideStatus;
    }
}
