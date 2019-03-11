package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.crops.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Mammal implements Produce {

    public String noise() {

        return "Cluck!!";
    }

    public Egg yield() {
        return new Egg();
    }
}
