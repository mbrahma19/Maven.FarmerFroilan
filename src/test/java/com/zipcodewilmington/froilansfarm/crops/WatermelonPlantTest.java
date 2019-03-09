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
    public void nullaryConstructorIsFertilizedTest(){
        //given
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        //when
        Boolean isFertilized = watermelonPlant.getHasBeenFertilized();
        //then
        Assert.assertFalse(isFertilized);
    }

    @Test
    public void nullaryConstructorIsHarvestedTest(){
        //given
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        //when
        Boolean isHarvested = watermelonPlant.getHasBeenHarvested();
        //then
        Assert.assertFalse(isHarvested);
    }

    @Test
    public void yieldWatermelonTest(){
        //given
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        //when
        Edible yieldedFood = watermelonPlant.yield();
        //then
        Assert.assertTrue(yieldedFood instanceof  Watermelon);
    }

    @Test
    public void setHasBeenFertilized(){
        //given
        Boolean expected = true;
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        //when
        watermelonPlant.setHasBeenFertilized(expected);
        Boolean actual = watermelonPlant.getHasBeenFertilized();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setHasBeenHarvested(){
        //given
        Boolean expected = true;
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        //when
        watermelonPlant.setHasBeenHarvested(expected);
        Boolean actual = watermelonPlant.getHasBeenHarvested();
        //then
        Assert.assertEquals(expected, actual);
    }
}
