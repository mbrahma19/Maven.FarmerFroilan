package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.crops.Tomato;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void istanceOfTest(){
        //Given
        Farmer farmer = new Farmer();
        //When
        Boolean actual = farmer instanceof Mammal;
        //Then
        Assert.assertTrue(actual);
    }
    @Test
    public void eatTest(){
        //Given
        Farmer farmer = new Farmer();
        Integer expected = 22;

        //When
        farmer.eat(new Tomato());
        Integer actual = farmer.getCaloricIntake();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void noiseTest(){
        //Given
        Farmer farmer = new Farmer();
        String expected = "This is starting to get weird...";

        //When

        String actual = farmer.noise();
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void plantTest() {
        //Given
        Farmer farmer = new Farmer();
        String expected;

        //When
        TomatoPlant tomatoPlant = new TomatoPlant();
        farmer.plant(tomatoPlant);

        //Then

    }
    @Test
    public void mountTest() {
        //Given
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        //When
        farmer.mount(horse);
        Boolean actual = horse.getRideStatus();

        //Then
        Assert.assertFalse(actual);
    }
    @Test
    public void dismountTest() {
        //Given
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        //When
        farmer.dismount(horse);
        Boolean actual = horse.getRideStatus();

        //Then
        Assert.assertTrue(actual);
    }

}
