package com.zipcodewilmington.froilansfarm.containers;

public class Field extends Container<CropRow> {

    public void clearField(){
        getList().clear();
    }
    public CropRow getCropRow(int index) {
        return getList().get(index);
    }

}

