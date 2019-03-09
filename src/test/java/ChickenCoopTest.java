import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;

import com.zipcodewilmington.froilansfarm.mammals.Chicken;

import org.junit.Assert;
import org.junit.Test;

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


}
