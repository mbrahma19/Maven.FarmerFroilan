package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.crops.Egg;
import org.junit.Assert;
import org.junit.Test;

public class EggTest {
    @Test
    public void Egg(){
         Egg egg = new Egg();
         Assert.assertTrue(egg instanceof Edible);
    }


}
