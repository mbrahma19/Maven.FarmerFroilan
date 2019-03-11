package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.crops.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Mammal implements Produce {
    private static Integer counter = 1;
    public String noise() {

        return "Cluck!!";
    }

    public Egg yield() {
        Egg egg = new Egg();
        if(counter % 4 == 0){
            egg.setHasBeenFertilized(true);
        }
        return egg;
    }
}
