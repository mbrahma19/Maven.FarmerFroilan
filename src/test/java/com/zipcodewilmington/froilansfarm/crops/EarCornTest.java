package com.zipcodewilmington.froilansfarm.crops;

import org.junit.Assert;
import org.junit.Test;

public class EarCornTest {

    @Test
    public void getCaloriesTest() {
        //Given
        EarCorn earCorn = new EarCorn();
        Integer expected = 86;


        //When
        Integer actual = earCorn.getCalories();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void edibleTest() {
        //Given
        EarCorn earCorn = new EarCorn();
        Integer expected = 100;


        //When
        earCorn.setCalories(expected);
        Integer actual = earCorn.getCalories();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
