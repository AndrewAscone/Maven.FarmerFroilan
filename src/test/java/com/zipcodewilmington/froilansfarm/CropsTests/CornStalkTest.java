package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import org.junit.Assert;
import org.junit.Test;


public class CornStalkTest {

    @Test
    public void constructorTest(){
        CornStalk test = new CornStalk("test");

        String expected = "test";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isCropTest(){
        CornStalk test = new CornStalk("test");

        Assert.assertTrue(test instanceof Crop);
    }

    @Test
    public void isProduceTest(){
        CornStalk test = new CornStalk("test");

        Assert.assertTrue(test instanceof Produce);
    }

    @Test
    public void cornStalkYieldTest(){
        CornStalk test = new CornStalk("test");

        Assert.assertNull(test.yield());
    }

    @Test
    public void cornStalkHasBeenFertilizedTest(){
        CornStalk test = new CornStalk("test");

        Assert.assertFalse(test.hasBeenFertilized());
    }

    @Test
    public void cornStalkHasBeenHarvestedTest(){
        CornStalk test = new CornStalk("test");

        Assert.assertFalse(test.hasBeenHarvested());
    }
}
