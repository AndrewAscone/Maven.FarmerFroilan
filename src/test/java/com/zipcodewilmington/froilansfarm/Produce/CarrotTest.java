package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Controller.Edible;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CarrotTest {

    @Test
    public void classInstance() {
        Carrot carrot = new Carrot("Carrot");
        Assert.assertTrue(carrot instanceof Vegetable);
    }
    @Test
    public void classInstance2() {
        Carrot carrot = new Carrot("Carrot");
        Assert.assertTrue(carrot instanceof Edible);
    }
    @Test
    public void getNameTest() {
        Carrot carrot = new Carrot("Carrot");
        Assert.assertEquals(carrot.getName(),"Carrot");
    }
}