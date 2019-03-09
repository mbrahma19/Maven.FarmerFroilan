package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.List;
import java.util.stream.Stream;

public class CropRow<T extends Crop> extends Container<Crop> {

    private Boolean hasBeenFertilized;

    public void fertilizeCropRow(){
        hasBeenFertilized = true;
        for(Crop c : super.getList()){
            c.setHasBeenFertilized(true);
        }
    }

    public List<T> harvestCropRow(){
        List<T> harvestList = new ArrayList<T>();
        Stream<Integer> arraywithoutDupes = Collection.strea
        );
        Integer[] deletedDupe = arraywithoutDupes.toArray(Integer[]::new);
        return deletedDupe;
    }

    public T getCrop(Crop cropToGet){

        return (T) getList().get(getList().indexOf(cropToGet));
    }

}
