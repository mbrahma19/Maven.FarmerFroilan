package com.zipcodewilmington.froilansfarm.crops;

public class Egg extends Edible {
    private Boolean hasBeenFertilized;

    public Egg() {
        super(72);
        hasBeenFertilized = false;
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public String toString() {
        return "Egg";
    }
}
