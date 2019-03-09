package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;

public class Field<T extends Crop> extends Container<CropRow> {


    public Field() {
       super();
        this.add(new CropRow<CornStalk>());
        this.add(new CropRow<TomatoPlant>());
        this.add(new CropRow());
        this.add(new CropRow());
        this.add(new CropRow());
    }

    public void add(CropRow<T> cropRow){
        if(getList().getClass().equals(cropRow.getClass())){
            add(cropRow);
        }
        super.add(new CropRow<T>());

    }

}

