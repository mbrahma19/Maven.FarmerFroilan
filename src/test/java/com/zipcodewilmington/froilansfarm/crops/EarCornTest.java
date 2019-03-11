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

//    @Test
//    public void setCaloriesTest() {
//        //Given
//        EarCorn earCorn = new EarCorn();
//        Integer expected = 100;
//
//
//        //When
//
//        Integer actual = earCorn.getCalories();
//
//        //Then
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void instanceOfTest() {
        //Given
        EarCorn earCorn = new EarCorn();



        //When
        Boolean actual = earCorn instanceof Edible;

        //Then
        Assert.assertTrue(actual);
    }
}
