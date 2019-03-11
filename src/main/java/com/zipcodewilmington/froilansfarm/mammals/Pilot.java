package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.transportation.CropDuster;

public class Pilot extends Human{

    public String noise() {
        return "CHHH, Attention passengers we may experience some turbulence CHHH";
    }

    public void fertilizeCrops() {
        CropDuster cropDuster = (CropDuster) Farm.getFarm().getAircraft();
        mount(cropDuster);
        cropDuster.operate(Farm.getFarm());
        dismount(cropDuster);
    }

}
