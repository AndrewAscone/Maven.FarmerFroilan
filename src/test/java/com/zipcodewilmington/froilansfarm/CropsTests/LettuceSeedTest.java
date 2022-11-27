package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.EggPlantSeed;
import com.zipcodewilmington.froilansfarm.Crops.LettuceSeed;
import com.zipcodewilmington.froilansfarm.Produce.Lettuce;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import org.junit.Assert;
import org.junit.Test;

public class LettuceSeedTest {

    @Test
    public void constructorTest(){
        LettuceSeed test = new LettuceSeed("test");

        String expected = "test";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isCropTest(){
        LettuceSeed test = new LettuceSeed("test");

        Assert.assertTrue(test instanceof Crop);
    }

    @Test
    public void isProduceTest(){
        LettuceSeed test = new LettuceSeed("test");

        Assert.assertTrue(test instanceof Produce);
    }

    @Test
    public void lettuceSeedYieldTest(){
        LettuceSeed test = new LettuceSeed("test");

        Assert.assertNull(test.yield());
    }

    @Test
    public void lettuceSeedHasBeenFertilizedTest(){
        LettuceSeed test = new LettuceSeed("test");

        Assert.assertFalse(test.hasBeenFertilized());
    }

    @Test
    public void lettuceSeedHasBeenHarvestedTest(){
        LettuceSeed test = new LettuceSeed("test");

        Assert.assertFalse(test.hasBeenHarvested());
    }
}
