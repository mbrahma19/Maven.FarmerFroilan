package com.zipcodewilmington.froilansfarm.builders;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;
import com.zipcodewilmington.froilansfarm.containers.Stable;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FarmFactoryTest {

    @Test
    public void addStables(){
        FarmFactory farmFactory = new FarmFactory();

        farmFactory.addStables(3).addChickenCoops(4);

        Farm farm = Farm.getFarm();

        List<Stable> stableList = farm.getStableList();
        List<ChickenCoop> chickenCoopList = farm.getChickenCoops();

        Assert.assertEquals(3,stableList.size());
        Assert.assertEquals(4,chickenCoopList.size());
    }
}
