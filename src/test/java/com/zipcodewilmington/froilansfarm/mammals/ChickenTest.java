package com.zipcodewilmington.froilansfarm.mammals;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.crops.Egg;
import com.zipcodewilmington.froilansfarm.crops.Watermelon;
import com.zipcodewilmington.froilansfarm.mammals.Chicken;
import com.zipcodewilmington.froilansfarm.mammals.Mammal;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void testEat() {
        //given
        Chicken chicken = new Chicken();
        Watermelon watermelon = new Watermelon();
        chicken.eat(watermelon);
        // when
        int actual = chicken.getCaloricIntake();
        int expected = 1371;
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testNoise(){
        //given
        Chicken  chicken = new Chicken();
        String expected = "Cluck!!";
        //when
        String actual = chicken.noise();
        //then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testYield(){
        //given
        Chicken chicken = new Chicken();
        Egg egg = new Egg();

        //when
        Edible actual = chicken.yield();
        //then
        Assert.assertTrue(actual instanceof Egg);
    }

    @Test
    public void testInstanceOfMammal(){
        //given
        Chicken chicken = new Chicken();
        //then
        Assert.assertTrue(chicken instanceof Mammal);

    }
}
