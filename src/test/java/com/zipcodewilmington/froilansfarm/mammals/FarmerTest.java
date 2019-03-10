package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.crops.Tomato;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.crops.WatermelonPlant;
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
        Farm farm = Farm.getFarm();
        Integer expected =2;

        //When
        CropRow cropRow = new CropRow();
        cropRow.add(new WatermelonPlant());
        farm.getCropField().add(cropRow);

        TomatoPlant tomatoPlant = new TomatoPlant();
        farmer.plant(tomatoPlant,0);
        Integer actual = farm.getCropField().getCropRow(0).size();

        //Then
        Assert.assertEquals(actual,expected);

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
