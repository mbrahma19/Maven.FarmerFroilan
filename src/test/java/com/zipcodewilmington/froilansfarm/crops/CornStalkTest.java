package com.zipcodewilmington.froilansfarm.crops;

import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void yieldTest() {
        //Given
        CornStalk cornStalk = new CornStalk();
        Integer expected = 86;
        //When
        EarCorn earCorn = cornStalk.yield();
        Integer actual = earCorn.getCalories();

        //Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void hasBeenFertilizedTest() {
        //Given
        CornStalk cornStalk = new CornStalk();
        Boolean expected = true;

        //When
        cornStalk.setHasBeenFertilized(expected);
        Boolean actual = cornStalk.getHasBeenFertilized();

        //Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void hasBeenHarvestedTest() {
        //Given
        CornStalk cornStalk = new CornStalk();
        Boolean expected = true;

        //When
        cornStalk.setHasBeenHarvested(expected);
        Boolean actual = cornStalk.getHasBeenHarvested();

        //Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void isAnInstanceOfCropTest() {
        //Given
        CornStalk cornStalk = new CornStalk();

        //When
        Boolean actual = cornStalk instanceof Crop;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void toStringTest(){
        //given
        CornStalk cornStalk = new CornStalk();
        String expected = "CornStalk";
        //when
        String actual = cornStalk.toString();
        //then
        Assert.assertEquals(expected,actual);
    }
}
