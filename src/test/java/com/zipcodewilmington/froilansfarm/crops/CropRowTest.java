package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CropRowTest {

    @Test
    public void nullaryConstructorTest(){
        //given
        CropRow cropRow = new CropRow();
        //when
        List createdList = cropRow.getList();
        //then
        Assert.assertTrue(createdList.isEmpty());
    }

    @Test
    public void addCropsTest(){
        //given
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        CropRow cropRow = new CropRow();
        Integer expectedSize = 2;
        //when
        cropRow.add(watermelonPlant);
        cropRow.add(watermelonPlant);
        Integer actualSize = cropRow.size();
        //then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeCropsTest(){
        //given
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        WatermelonPlant watermelonPlant2 = new WatermelonPlant();
        CornStalk cornStalk = new CornStalk();
        TomatoPlant tomatoPlant = new TomatoPlant();
        CropRow<WatermelonPlant> cropRow = new CropRow();
        Integer expectedSize = 3;
        //when
        cropRow.add(watermelonPlant);
        cropRow.add(watermelonPlant2);
        cropRow.add(cornStalk);
        cropRow.add(tomatoPlant);
        cropRow.remove(watermelonPlant2);
        Integer actualSize = cropRow.size();

        //then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeCropsContainsTest(){
        //given
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        WatermelonPlant watermelonPlant2 = new WatermelonPlant();
        CornStalk cornStalk = new CornStalk();
        TomatoPlant tomatoPlant = new TomatoPlant();
        CropRow<WatermelonPlant> cropRow = new CropRow();

        //when
        cropRow.add(watermelonPlant);
        cropRow.add(watermelonPlant2);
        cropRow.add(cornStalk);
        cropRow.add(tomatoPlant);
        cropRow.remove(watermelonPlant2);
        List<Crop> list = cropRow.getList();

        //then
        Assert.assertFalse(list.contains(watermelonPlant2));
    }

    @Test
    public void getListTest(){
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        WatermelonPlant watermelonPlant2 = new WatermelonPlant();
        CornStalk cornStalk = new CornStalk();
        TomatoPlant tomatoPlant = new TomatoPlant();
        ArrayList<Crop> expectedList = new ArrayList<Crop>(Arrays.asList(new Crop[]{watermelonPlant,watermelonPlant2,cornStalk,tomatoPlant}));

        //when
        CropRow<WatermelonPlant> cropRow = new CropRow();
        cropRow.add(watermelonPlant);
        cropRow.add(watermelonPlant2);
        cropRow.add(cornStalk);
        cropRow.add(tomatoPlant);
        ArrayList<Crop> actualList = (ArrayList)cropRow.getList();

        //then
        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void fertilizeTest(){
        //given

        //when

        //then
    }

}
