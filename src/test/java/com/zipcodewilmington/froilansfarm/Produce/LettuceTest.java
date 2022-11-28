package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Controller.Edible;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import org.junit.Assert;
import org.junit.Test;
public class LettuceTest {

    @Test
    public void classInstance() {
        Lettuce lettuce = new Lettuce("lettuce");
        Assert.assertTrue(lettuce instanceof Vegetable);
    }
    @Test
    public void classInstance2() {
        Lettuce lettuce = new Lettuce("lettuce");
        Assert.assertTrue(lettuce instanceof Edible);
    }
    @Test
    public void getNameTest() {
        Lettuce lettuce = new Lettuce("lettuce");
        Assert.assertEquals(lettuce.getName(),"lettuce");
    }

}