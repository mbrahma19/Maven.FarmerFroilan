package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Pilot extends Mammal implements Rider, Eater {
    public void eat(Edible edibleFood) {

    }

    public String noise() {
        return null;
    }

    public void mount(Rideable entity) {

    }

    public void dismount(Rideable entity) {

    }
}
