package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.crops.Egg;
import com.zipcodewilmington.froilansfarm.crops.Watermelon;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {
    @After
    public void setup(){
        Farm.getFarm().resetFarm();
    }

    @Test
    public void testPilotTest() {
        //given
        Pilot pilot = new Pilot();
        Watermelon watermelon = new Watermelon();
        Egg egg = new Egg();
        pilot.eat(watermelon);//1371
        pilot.eat(egg);//72
        pilot.eat(egg);
        pilot.eat(egg);
        pilot.eat(egg);
        pilot.eat(egg);//360
        // when
        int actual = pilot.getCaloricIntake();
        int expected = 1731;
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNoise() {
        //given
        Pilot pilot = new Pilot();
        String expected = "CHHH, Attention passengers we may experience some turbulence CHHH";
        //when
        String actual = pilot.noise();
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMount() {
        //given
        Pilot pilot = new Pilot();
        Horse horsey = new Horse();
        Boolean expected = true;
        pilot.mount(horsey);

        //when
        Boolean actual = pilot.getCurrentlyRiding();
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testDismount() {
        //given
        Pilot pilot = new Pilot();
        Horse horsey = new Horse();
        Boolean expected = false;
        pilot.mount(horsey);
        pilot.dismount(horsey);
        //when
        Boolean actual = pilot.getCurrentlyRiding();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetTransportation() {
        //given
        Pilot pilot = new Pilot();
        Horse horsey = new Horse();
        pilot.mount(horsey);
        //when
        Rideable actual = pilot.getCurrentTransportation();
        //then
        Assert.assertEquals(horsey,actual);
    }
}
