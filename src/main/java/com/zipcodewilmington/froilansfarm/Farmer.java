package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Rider,Eater,Botanist{

    public void eat(Edible edibleFood) {

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
