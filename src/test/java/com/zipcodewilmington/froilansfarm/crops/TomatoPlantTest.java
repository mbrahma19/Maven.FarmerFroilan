package com.zipcodewilmington.froilansfarm.crops;

import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void yieldTest() {
        //Given
        TomatoPlant tomatoPlant = new TomatoPlant();


        //When
        Tomato tomato = tomatoPlant.yield();

        //Then
        Assert.assertNotNull(tomato);
    }

    @Test
    public void instanceOfCropTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();

        Boolean actual = tomatoPlant instanceof Crop;

        Assert.assertTrue(actual);
    }

    @Test
    public void hasBeenFertalizedTest() {
        //Given
        TomatoPlant tomatoPlant = new TomatoPlant();
        Boolean expected = false;


        //When
        tomatoPlant.setHasBeenFertilized(expected);
        Boolean actual = tomatoPlant.getHasBeenFertilized();

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void hasBeenHarvestedTest() {
        //Given
        TomatoPlant tomatoPlant = new TomatoPlant();
        Boolean expected = true;


        //When
        tomatoPlant.setHasBeenHarvested(expected);
        Boolean actual = tomatoPlant.getHasBeenHarvested();

        //Then
        Assert.assertTrue(actual);
    }
}
