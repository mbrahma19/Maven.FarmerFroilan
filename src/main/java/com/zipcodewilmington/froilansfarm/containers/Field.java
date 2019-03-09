package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;

public class Field extends Container<CropRow> {



    //Container<CropRow> cropRowContainer;

    public Field() {
       super();
       this.add(new CropRow<TomatoPlant>());
       this.add(new CropRow());


    }

    public void add(CropRow cropRow){

    }

}

