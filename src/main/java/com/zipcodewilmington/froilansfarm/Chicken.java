package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce{
    public void eat(Edible edibleFood) {

    }

    public String noise() {
        return null;
    }

    public <T extends Edible> T yield() {
        return null;
    }
}
