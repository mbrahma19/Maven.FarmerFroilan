package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.containers.CropRow;

public interface Botanist<T extends Crop> {

    void plant(T cropToPlant);
}
