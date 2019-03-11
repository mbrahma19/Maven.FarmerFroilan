package com.zipcodewilmington.froilansfarm.builders;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.WatermelonPlant;
import org.junit.After;
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
        FarmBuilder farmBuilder = FarmBuilder.getFarmBuilder();
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
        FarmBuilder farmBuilder = FarmBuilder.getFarmBuilder();
        //when
        farmBuilder.addCropRows("watermelonplant",4);
        Crop actual = Farm.getFarm().getCropField().getList().get(0).getList().get(0);
        //then
        Assert.assertTrue(actual instanceof WatermelonPlant);
    }

    @Test
    public void addChickenCoopAndChickensTest(){
        //given
        FarmBuilder farmBuilder = FarmBuilder.getFarmBuilder();
        Integer expected = 7;
        //when
        farmBuilder.addChickenCoops(expected);
        Integer actual = Farm.getFarm().getChickenCoops().get(0).size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addStableAndHorsesTest(){
        //given
        FarmBuilder farmBuilder = FarmBuilder.getFarmBuilder();
        Integer expected = 10;
        //when
        farmBuilder.addStable(expected);
        Integer actual = Farm.getFarm().getStableList().get(0).size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFroilanFarmStableTest(){
        //given
        Farm farm = FarmBuilder.getFarmBuilder().getFroilanFarm();

        Integer expectedStable1Size = 2;
        Integer expectedStable2Size = 4;
        Integer expectedStable3Size = 4;

        //when
        Integer actualStable1Size = farm.getStableList().get(0).size();
        Integer actualStable2Size = farm.getStableList().get(1).size();
        Integer actualStable3Size = farm.getStableList().get(2).size();
        //then
        Assert.assertEquals(expectedStable1Size,actualStable1Size);
        Assert.assertEquals(expectedStable2Size,actualStable2Size);
        Assert.assertEquals(expectedStable3Size,actualStable3Size);
    }

    @Test
    public void getFroilanFarmChickenCoopTest(){
        //given
        Farm farm = FarmBuilder.getFarmBuilder().getFroilanFarm();

        Integer expectedCC1Size = 4;
        Integer expectedCC2Size = 5;
        Integer expectedCC3Size = 3;
        Integer expectedCC4Size = 3;

        //when
        Integer actualCC1Size = farm.getChickenCoops().get(0).size();
        Integer actualCC2Size = farm.getChickenCoops().get(1).size();
        Integer actualCC3Size = farm.getChickenCoops().get(2).size();
        Integer actualCC4Size = farm.getChickenCoops().get(3).size();
        //then
        Assert.assertEquals(expectedCC1Size,actualCC1Size);
        Assert.assertEquals(expectedCC2Size,actualCC2Size);
        Assert.assertEquals(expectedCC3Size,actualCC3Size);
        Assert.assertEquals(expectedCC4Size,actualCC4Size);
    }
}
