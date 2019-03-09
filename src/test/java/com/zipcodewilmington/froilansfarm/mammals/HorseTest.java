package com.zipcodewilmington.froilansfarm.mammals;


import com.zipcodewilmington.froilansfarm.crops.Watermelon;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void horseConstructorTest(){
        Horse horse = new Horse();

        Boolean actual = horse.getRideStatus();

        Assert.assertTrue(actual);

    }

    @Test
    public void noiseTest() {
        //Given
        Horse horse = new Horse();
        String expected = "neigh!";

        //When
        String actual = horse.noise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        //Given
        Horse horse = new Horse();
        Integer expected = 1371;


        //When
        Watermelon watermelon = new Watermelon();
        horse.eat(watermelon);
        Integer actual = horse.getCaloricIntake();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void getRideStatusTest() {
        //Given
        Horse horse = new Horse();
        Boolean expected = false;


        //When
        Farmer farmer = new Farmer();
        horse.setRideStatus(false);

        Boolean actual = horse.getRideStatus();

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isInstanceOfMammalTest(){
        Horse horse = new Horse();

        Boolean actual = horse instanceof Mammal;

        Assert.assertTrue(actual);
    }

}
