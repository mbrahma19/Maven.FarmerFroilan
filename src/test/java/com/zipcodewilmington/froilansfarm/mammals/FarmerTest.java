package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.builders.FarmBuilder;
import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.crops.Tomato;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.crops.WatermelonPlant;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.transportation.CropDuster;
import com.zipcodewilmington.froilansfarm.transportation.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FarmerTest {
    @Before
    public void setup(){
        Farm.getFarm().resetFarm();
    }

    @Test
    public void instanceOfTest(){
        //Given
        Farmer farmer = new Farmer();
        //When
        Boolean actual = farmer instanceof Mammal;
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void instanceOfRiderTest(){
        //Given
        Farmer farmer = new Farmer();
        //When
        Boolean actual = farmer instanceof Rider;
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void instanceOfNoiseMakerTest(){
        //Given
        Farmer farmer = new Farmer();
        //When
        Boolean actual = farmer instanceof NoiseMaker;
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
        farm.getCropField().clearField();
        Integer expected =2;

        //When
        CropRow cropRow = new CropRow();
        cropRow.add(new WatermelonPlant());
        farm.getCropField().add(cropRow);

        TomatoPlant tomatoPlant = new TomatoPlant();
        farmer.plant(tomatoPlant,0);
        Integer actual = farm.getCropField().getCropRow(0).size();

        //Then
        Assert.assertEquals(expected,actual);

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
    public void mountGetTransportationTest() {
        //Given
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        //When
        farmer.mount(horse);
        Rideable actual = farmer.getCurrentTransportation();

        //Then
        Assert.assertEquals(horse,actual);
    }

    @Test
    public void dismountTest() {
        //Given
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        //When
        farmer.mount(horse);
        farmer.dismount(horse);
        Boolean actual = horse.getRideStatus();

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void dismountCheckRidingStatusTest() {
        //Given
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        //When
        farmer.mount(horse);
        farmer.dismount(horse);
        Boolean actual = farmer.getCurrentlyRiding();

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void mountHorseWhenAlreadyRidingTest() {
        //Given
        Farmer farmer = new Farmer();
        Tractor tractor = new Tractor();
        Horse horse = new Horse();

        //When
        farmer.mount(tractor);
        farmer.mount(horse);
        Rideable actual = farmer.getCurrentTransportation();

        //Then
        Assert.assertEquals(horse,actual);
    }

    @Test
    public void harvestFarmTest(){
        //given
        FarmBuilder farmBuilder = FarmBuilder.getFarmBuilder();
        farmBuilder.addCropRows("watermelonplant",4)
                .addCropRows("tomatoplant",2);
        Farm farm = Farm.getFarm();
        CropDuster cropDuster = (CropDuster)farm.getAircraft();
        Tractor tractor = (Tractor)farm.getVehicle1();
        //when
        cropDuster.operate(farm);
        tractor.operate(farm);
        List<Edible> edibles = tractor.getTractorBin();
        System.out.println(edibles.toString());
        //then
        Assert.assertEquals(6,edibles.size());
    }
}
