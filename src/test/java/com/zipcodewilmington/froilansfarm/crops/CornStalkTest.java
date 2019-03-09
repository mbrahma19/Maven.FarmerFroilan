package com.zipcodewilmington.froilansfarm.crops;

import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void cornStalkTest(){
        //Given
        CornStalk cornStalk = new CornStalk();
        Integer expected =86;
        //When
        EarCorn earCorn = cornStalk.yield();
        Integer actual = earCorn.getCalories();

        //Then
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void hasBeenFertilizedTest() {
        //Given
        CornStalk cornStalk = new CornStalk();
        Boolean expected = true;

        //When
        Boolean actual = cornStalk.getHasBeenFertilized();

        //Then
        Assert.assertEquals(actual, expected);
    }
}
