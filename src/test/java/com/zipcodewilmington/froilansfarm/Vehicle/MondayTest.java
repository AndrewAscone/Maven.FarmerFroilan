package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Monday;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class MondayTest {
    Monday monday = new Monday();

    Pilot froilanda = new Pilot("Froilanda", 28);

    CropDuster cropDuster = new CropDuster("Crop Duster");

    @Test
    public void cropDusterOperateTest(){
        Assert.assertFalse(monday.cropDusterOperate());
    }

    @Test
    public void cropDusterFlyTest(){
        monday.cropDusterOperate();
        Assert.assertTrue(monday.cropDusterFly());
    }

    @Test
    public void cropDusterFertilizeTest(){
        monday.cropDusterOperate();
        monday.cropDusterFly();
        Assert.assertTrue(monday.cropDusterFertilize());
    }

    @Test
    public void cropDusterSwitchOffTest(){
        monday.cropDusterOperate();
        monday.cropDusterFly();
        Assert.assertFalse(monday.cropDusterSwitchOff());
    }
}
