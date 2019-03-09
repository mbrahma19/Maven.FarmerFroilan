package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.containers.Container;
import com.zipcodewilmington.froilansfarm.containers.Field;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Farmer extends Mammal implements Rider, Eater, Botanist {

    CropRow cropRow;

    public void eat(Edible edibleFood) {
        super.addCalories(edibleFood.getCalories());
    }

    public String noise() {
        return "This is starting to get weird...";
    }

    public void plant(Crop cropToPlant) {
        cropRow.getCrop(cropToPlant);
        cropRow.add(cropToPlant);
    }

    public void mount(Rideable entity) {
        if(entity.getRideStatus()!=false){
            entity.setRideStatus(false);
        }
    }

    public void dismount(Rideable entity) {

        entity.setRideStatus(true);

    }
}
