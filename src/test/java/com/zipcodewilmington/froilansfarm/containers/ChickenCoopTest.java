package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;
import com.zipcodewilmington.froilansfarm.mammals.Chicken;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class ChickenCoopTest {
    @Test
    public void addTest() {
        //Given
        ChickenCoop chickenHouse = new ChickenCoop();
        Chicken chicken = new Chicken();
        Integer expected = 1;

        //When
        chickenHouse.add(chicken);
        Integer actual = chickenHouse.size();


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removetest() {
        //Given
        ChickenCoop chickenHouse = new ChickenCoop();

        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Integer expected = 0;

        //When

        chickenHouse.remove(chicken1);
        chickenHouse.remove(chicken2);
        chickenHouse.remove(chicken3);
        Integer actual = chickenHouse.size();


        //Then
        Assert.assertEquals(expected, actual);


    }
    @Test
    public void testGetList() {
        //Given
        ChickenCoop chickenhouse = new ChickenCoop();
        Chicken chicken = new Chicken();
        Chicken chicken1  = new Chicken();
        Chicken chicken2 = new Chicken();
        List<Chicken> expected = new ArrayList<Chicken>();
        expected.add(chicken);
        expected.add(chicken1);
        expected.add(chicken2);

         //When
        chickenhouse.add(chicken);
        chickenhouse.add(chicken1);
        chickenhouse.add(chicken2);
        List<Chicken> actual = chickenhouse.getList();


        //Then
        Assert.assertEquals(expected, actual);
    }

    }
