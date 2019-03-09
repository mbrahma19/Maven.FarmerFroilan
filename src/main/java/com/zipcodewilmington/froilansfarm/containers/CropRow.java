package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.crops.Crop;

public class CropRow extends Container<Crop> {

    private Boolean hasBeenFertilized;

    public void fertilizeCropRow(){
        hasBeenFertilized = true;
        for(Crop c : super.getList()){
            c.setHasBeenFertilized(true);
        }
    }

}
