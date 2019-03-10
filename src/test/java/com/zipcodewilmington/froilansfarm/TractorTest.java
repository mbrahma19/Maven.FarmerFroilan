package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.crops.WatermelonPlant;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.transportation.Tractor;
import com.zipcodewilmington.froilansfarm.transportation.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TractorTest {

    @Test
    public void instanceOfTest(){

        Tractor tractor = new Tractor();

        Boolean actual = tractor instanceof Vehicle;
        Boolean actual2 = tractor instanceof FarmVehicle;


        Assert.assertTrue(actual);
        Assert.assertTrue(actual2);
    }
    @Test
    public void noiseTest(){
        //Given
        Tractor tractor = new Tractor();
        String expected = "hissssssssss ssss ss";

        //When
        String actual = tractor.noise();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getTractorBinTest(){
        //Given
        Farm farm = Farm.getFarm();
        Tractor tractor = (Tractor) farm.getVehicle1();
        CropRow cropRow = new CropRow();
        cropRow.add(new WatermelonPlant());
        cropRow.add(new TomatoPlant());
        cropRow.fertilizeCropRow();
        farm.getCropField().add(cropRow);

        //When
        tractor.operate(farm);
        List<Edible> harvestList = tractor.getTractorBin();

        //Then
        Assert.assertEquals(2,harvestList.size());
    }







}
