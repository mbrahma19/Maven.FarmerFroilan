package com.zipcodewilmington.froilansfarm.crops;

public class EarCorn extends Edible {

    public EarCorn() {
        this(86);
    }

    private EarCorn(Integer caloricValue) {
        super(caloricValue);

    }

    @Override
    public String toString() {
        return "EarCorn";
    }
}
