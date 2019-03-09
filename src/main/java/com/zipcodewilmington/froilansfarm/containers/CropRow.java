package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.Edible;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CropRow<T extends Crop> extends Container<Crop> {

    private Boolean hasBeenFertilized;
    private Boolean hasBeenHarvested;

    

    public void fertilizeCropRow(){
        hasBeenFertilized = true;
        for(Crop c : getList()){
            c.setHasBeenFertilized(true);
        }
    }

    public List<Edible> harvestCropRow(){
        Stream<Edible> edibleStream = getList().stream().filter( crop -> crop.getHasBeenFertilized()).map(Crop::yield);
        List<Edible> harvestList  = edibleStream.collect(Collectors.toList());
        return harvestList;
    }

    public Crop getCrop(Crop cropToGet){
        return getList().get(getList().indexOf(cropToGet));
    }


}
