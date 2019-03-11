package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.crops.Crop;

public interface Botanist<T extends Crop> {

    void plant(T cropToPlant, int index);
}
