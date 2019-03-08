package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Farmer extends Mammal implements Rider, Eater, Botanist {

    public void eat(Edible edibleFood) {
        super.addCalories(edibleFood.getCalories());
    }

    public String noise() {
        return "This is starting to get weird...";
    }

    public CropRow plant(Crop cropToPlant) {
        return null;
    }

    public void mount(Rideable entity) {

    }

    public void dismount(Rideable entity) {

    }
}
