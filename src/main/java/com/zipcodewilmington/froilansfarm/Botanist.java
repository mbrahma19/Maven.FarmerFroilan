package com.zipcodewilmington.froilansfarm;

public interface Botanist<T extends Crop> {

    CropRow plant(T cropToPlant);
}
