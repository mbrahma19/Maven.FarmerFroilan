package com.zipcodewilmington.froilansfarm.builders;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.WatermelonPlant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmBuilderTest {

    @Before
    public void setup(){
        Farm.getFarm().resetFarm();
    }

    @Test
    public void checkCropRowSizeTest(){
        //given
        FarmBuilder farmBuilder = new FarmBuilder();
        Integer expected = 4;
        //when
        farmBuilder.addCropRows("watermelonplant",expected);
        Integer actual = Farm.getFarm().getCropField().getCropRow(0).size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkCropRowTypeTest(){
        //given
        FarmBuilder farmBuilder = new FarmBuilder();
        //when
        farmBuilder.addCropRows("watermelonplant",4);
        Crop actual = Farm.getFarm().getCropField().getList().get(0).getList().get(0);
        //then
        Assert.assertTrue(actual instanceof WatermelonPlant);
    }

    @Test
    public void addStableAndHorsesTest(){
        //given
        FarmBuilder farmBuilder = new FarmBuilder();
        Integer expected = 7;
        //when
        farmBuilder.addChickenCoops(expected);
        Integer actual = Farm.getFarm().getChickenCoops().get(0).size();
        //then
        Assert.assertEquals(expected,actual);
    }
}
