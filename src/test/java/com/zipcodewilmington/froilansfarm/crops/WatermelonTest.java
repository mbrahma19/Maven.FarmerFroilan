package com.zipcodewilmington.froilansfarm.crops;


import org.junit.Assert;
import org.junit.Test;

public class WatermelonTest {

    @Test
    public void inInstanceOfTest(){
        //given
        Watermelon watermelon = new Watermelon();
        //when
        Boolean isEdible = (watermelon instanceof Edible);
        //then
        Assert.assertTrue(isEdible);
    }

    @Test
    public void nullaryConstructorTest(){
        //given
        Watermelon watermelon = new Watermelon();
        Integer expectedCal0ricValue = 1371;
        //when
        Integer caloricValue = watermelon.getCalories();
        //then
        Assert.assertEquals(expectedCal0ricValue, caloricValue);
    }

    @Test
    public void setCalorieValueTest(){
        //given
        Integer expected = 1000;
        Watermelon watermelon = new Watermelon();
        //when
        watermelon.setCalories(1000);
        Integer actual = watermelon.getCalories();
        //then
        Assert.assertEquals(expected,actual);
    }

}
