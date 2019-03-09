package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.transportation.Tractor;
import com.zipcodewilmington.froilansfarm.transportation.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void instanceOfTest(){

        Tractor tractor = new Tractor();

        Boolean actual = tractor instanceof Vehicle;
        Boolean actual2 = tractor instanceof FarmVehicle;


        Assert.assertTrue(actual);
        Assert.assertTrue(actual2);
    }
    @Test
    public void noiseTest(){
        //Given
        Tractor tractor = new Tractor();
        String expected = "hissssssssss ssss ss";

        //When
        String actual = tractor.noise();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getTractorBinTest(){
        //Given
        Tractor tractor = new Tractor();
        Farm farm = Farm.getFarm();

        //When
        tractor.operate(farm);

        //Then

    }







}
