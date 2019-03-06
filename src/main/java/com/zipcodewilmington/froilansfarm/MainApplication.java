package com.zipcodewilmington.froilansfarm;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        CornStalk cropType = new CornStalk();
        TomatoPlant cropType2 = new TomatoPlant();

        Crop[] cropArray = new Crop[4];

        cropArray[0] = cropType;
        cropArray[1] = cropType2;

        System.out.println(cropArray.toString());
    }

}
