package com.zipcodewilmington.froilansfarm.crops;

public class TomatoPlant extends Crop {

    public Tomato yield() {
        return new Tomato();
    }

    @Override
    public String toString() {
        return "Tomato Plant";
    }
}
