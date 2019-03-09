package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Mammal implements NoiseMaker, Eater {

    private Integer caloricIntake;

    public Mammal(){
        this.caloricIntake = 0;
    }

    public Integer getCaloricIntake() {
        return caloricIntake;
    }

    public void addCalories(Integer caloricIntake) {
        this.caloricIntake = this.caloricIntake + caloricIntake;
    }

    public void eat(Edible edible){
        addCalories(edible.getCalories());
    }


}
