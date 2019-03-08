package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.mammals.Horse;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

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
        String expected = "neigh!";

        //When
        String actual = horse.noise();

        //Then
        Assert.assertEquals(expected, actual);

    }

}
