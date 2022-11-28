package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.CarrotSeed;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Produce.Carrot;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import org.junit.Assert;
import org.junit.Test;

public class CarrotSeedTests {
    @Test
    public void constructorTest(){
        CarrotSeed test = new CarrotSeed("test");
        String expected = "test";
        String actual = test.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void carrotseedIsCropTest(){
        CarrotSeed test = new CarrotSeed("test");
        Assert.assertTrue(test instanceof Crop);
    }
    @Test
    public void carrotseedIsProduceTest(){
        CarrotSeed test = new CarrotSeed("test");
        Assert.assertTrue(test instanceof Produce<?>);
    }
    @Test
    public void carrotseedYieldTest(){
        CarrotSeed test = new CarrotSeed("test");
        Assert.assertNull(test.yield());
    }
    @Test
    public void carrotseedHasBeenFertilized(){
        CarrotSeed test = new CarrotSeed("test");
        Assert.assertFalse(test.hasBeenFertilized());
    }
    @Test
    public void carrotseedHasBeenHarvested(){
        CarrotSeed test = new CarrotSeed("test");
        Carrot testCarrot = new Carrot("carrot");
        Assert.assertFalse(test.hasBeenHarvested());
    }
}
