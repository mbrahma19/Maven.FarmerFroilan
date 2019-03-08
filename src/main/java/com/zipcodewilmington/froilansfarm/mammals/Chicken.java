package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Mammal implements Produce {

    public void eat(Edible edibleFood) {

    }

    public String noise() {
        return null;
    }

    public <T extends Edible> T yield() {
        return null;
    }
}
