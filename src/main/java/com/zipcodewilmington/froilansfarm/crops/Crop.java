package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {

    private Boolean hasBeenFertilized;
    private Boolean hasBeenHarvested;

    public void fertilizeCrop(){
        hasBeenFertilized = true;
    }

}
