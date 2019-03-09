package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.mammals.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StableTest {

    @Test
    public void addTest(){
        //Given
        Stable stable = new Stable();
        Horse horse = new Horse();
        Integer expected =1;

        //When
        stable.add(horse);
        Integer actual = stable.size();


        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){
        //Given
        Stable stable = new Stable();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Integer expected =2;

        //When
        stable.add(horse1);
        stable.add(horse2);
        stable.add(horse3);
        stable.remove(horse1);
        Integer actual = stable.size();


        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getListTest(){
        //Given
        Stable stable = new Stable();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        List<Horse> expected = new ArrayList<Horse>();
        expected.add(horse1);
        expected.add(horse2);
        expected.add(horse3);


        //When
        stable.add(horse1);
        stable.add(horse2);
        stable.add(horse3);
        List<Horse> actual= stable.getList();



        //Then
        Assert.assertEquals(expected,actual);
    }
}
