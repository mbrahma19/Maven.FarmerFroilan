package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.crops.Edible;

public class Egg extends Edible {

    private Boolean hasBeenFertilized;

    private Egg(Integer caloricValue){
        super(caloricValue);
    }
}
