package com.zipcodewilmington.froilansfarm.crops;

import org.junit.Assert;
import org.junit.Test;

public class WatermelonPlantTest {

    @Test
    public void isInstanceOfTest(){
        //given
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        //when
        Boolean isCrop = watermelonPlant instanceof Crop;
        //then
        Assert.assertTrue(isCrop);
    }

    @Test
    public void nullaryConstructorTest(){
        //given
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        //when
        
        //then
    }

    @Test
    public void yieldWatermelonTest(){
        //given

        //when

        //then
    }

    @Test
    public void setHasBeenFertilized(){
        //given

        //when

        //then

    }

    @Test
    public void setHasBeenHarvested(){
        //given

        //when

        //then
    }
}
