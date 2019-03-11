package com.zipcodewilmington.froilansfarm.crops;

public class CornStalk extends Crop {

    public EarCorn yield() {
        return new EarCorn();
    }

    @Override
    public String toString() {
        return "CornStalk";
    }
}
