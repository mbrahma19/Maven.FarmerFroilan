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
    public void instanceOfTest() {
        //Given
        EarCorn earCorn = new EarCorn();

        //When
        Boolean actual = earCorn instanceof Edible;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void toStringTest(){
        //given
        EarCorn earCorn = new EarCorn();
        String expected = "EarCorn";
        //when
        String actual = earCorn.toString();
        //then
        Assert.assertEquals(expected,actual);
    }
}
