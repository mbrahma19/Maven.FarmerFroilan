package com.zipcodewilmington.froilansfarm.crops;

public class Tomato extends Edible {

    public Tomato() {
        this(22);
    }

    private Tomato(Integer caloricValue) {
        super(caloricValue);
    }

    @Override
    public String toString() {
        return "Tomato";
    }
}
