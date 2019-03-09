package com.zipcodewilmington.froilansfarm.crops;

import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {

    @Test
    public void getCaloriesTest(){
        //Given
        Tomato tomato = new Tomato();
        Integer expected =22;

        //When
        Integer actual = tomato.getCalories();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void constructorTest(){
        //Given
        Tomato tomato = new Tomato();


        //When
        Boolean actual = tomato instanceof Edible;

        //Then
        Assert.assertTrue(actual);
    }

}
