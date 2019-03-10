package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.Edible;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CropRow extends Container<Crop> {

    private Boolean hasBeenFertilized;
    private Boolean hasBeenHarvested;

    public CropRow(List list){
        super(list);
        hasBeenFertilized = false;
        hasBeenHarvested = false;
    }

    public CropRow(){
        super();
        hasBeenFertilized = false;
        hasBeenHarvested = false;
    }

    public void fertilizeCropRow(){
        hasBeenFertilized = true;
        hasBeenHarvested = false;
        for(Crop c : getList()){
            c.setHasBeenFertilized(true);
        }
    }

    public List<Edible> harvestCropRow(){
        Stream<Edible> edibleStream = getList().stream().filter( crop -> crop.getHasBeenFertilized()).map(Crop::yield);
        List<Edible> harvestList  = edibleStream.collect(Collectors.toList());
        hasBeenHarvested = true;
        hasBeenFertilized = false;
        return harvestList;
    }

    public Crop getCrop(Crop cropToGet){
        return getList().get(getList().indexOf(cropToGet));
    }

    //public List<>

}
