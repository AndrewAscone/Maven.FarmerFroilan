package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.LettuceSeed;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void constructorTest(){
        TomatoPlant test = new TomatoPlant("test");

        String expected = "test";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isCropTest(){
        TomatoPlant test = new TomatoPlant("test");

        Assert.assertTrue(test instanceof Crop);
    }

    @Test
    public void isProduceTest(){
        TomatoPlant test = new TomatoPlant("test");

        Assert.assertTrue(test instanceof Produce);
    }

    @Test
    public void tomatoPlantYieldTest(){
        TomatoPlant test = new TomatoPlant("test");

        Assert.assertNull(test.yield());
    }

    @Test
    public void tomatoPlantHasBeenFertilizedTest(){
        TomatoPlant test = new TomatoPlant("test");

        Assert.assertFalse(test.hasBeenFertilized());
    }

    @Test
    public void tomatoPlantHasBeenHarvestedTest(){
        TomatoPlant test = new TomatoPlant("test");

        Assert.assertFalse(test.hasBeenHarvested());
    }
}
