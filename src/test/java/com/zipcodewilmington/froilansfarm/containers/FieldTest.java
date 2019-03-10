package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.crops.WatermelonPlant;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FieldTest {

    @Test
    public void clearFieldTest(){
        //given
        Integer expectedSize = 0;
        Field field = new Field();
        CropRow wmRow = new CropRow(Arrays.asList(
                new WatermelonPlant(),
                new WatermelonPlant(),
                new WatermelonPlant())){};
        CropRow tpRow = new CropRow(Arrays.asList(new TomatoPlant(),
                new TomatoPlant(),
                new TomatoPlant(),
                new TomatoPlant()));
        field.add(wmRow);
        field.add(tpRow);

        //when
        field.clearField();
        Integer actualSize = field.size();
        //then
        Assert.assertEquals(expectedSize,actualSize);
    }
}

