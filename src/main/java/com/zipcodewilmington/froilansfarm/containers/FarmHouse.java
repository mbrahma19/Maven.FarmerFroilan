package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.mammals.Mammal;

public class FarmHouse extends Container<Mammal> {

    private Fridge fridge;

    public FarmHouse() {
        super();
        fridge = new Fridge();
    }

    public Fridge getFridge() {
        return fridge;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }
}
