package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import org.junit.Assert;
import org.junit.Test;

public class CropTest {

    @Test
    public void hasBeenHarvestedTest(){
        Crop test = new Crop();

        Assert.assertFalse(test.hasBeenHarvested());
    }

    @Test
    public void getNameTest(){
        Crop test = new Crop();

        Assert.assertNull(test.getName());
    }
}
