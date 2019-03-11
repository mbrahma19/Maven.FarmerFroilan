package com.zipcodewilmington.froilansfarm.transportation;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.Field;
import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.crops.WatermelonPlant;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {
    @Test
    public void testNoise() {
        //given
        CropDuster cropDuster = new CropDuster();
        String expected = "flying noises";
        //when
        String actual = cropDuster.noise();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFly() {
        //given
        CropDuster cropDuster = new CropDuster();
        cropDuster.fly();

        //when
        Boolean actual = cropDuster.getFlying();
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testOperate() {
        //given
        Farm farm = Farm.getFarm();
        Crop crop = new WatermelonPlant();
        Crop crop1 = new TomatoPlant();
        Crop crop2 = new CornStalk();
        CropRow cropRow = new CropRow();
        cropRow.getList().add(crop);
        cropRow.getList().add(crop1);
        cropRow.getList().add(crop2);

        farm.getCropField().add(cropRow);
        CropDuster aircraft = (CropDuster) farm.getAircraft();

        //when
        aircraft.operate(farm);
        Boolean result = getFertilizeStatus(farm.getCropField().getList().get(0));
        //then
        Assert.assertTrue(result);

    }

    private boolean getFertilizeStatus(CropRow cropRow) {
        boolean result = true;
        for (Crop c : cropRow.getList()) {
            if (c.getHasBeenFertilized() == false) {
                result = false;
            }
        }
        return result;
    }

}
