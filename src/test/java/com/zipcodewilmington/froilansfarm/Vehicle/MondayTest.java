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
        Assert.assertFalse(froilanda.operate(cropDuster));
    }

    @Test
    public void cropDusterFlyTest(){
        froilanda.operate(cropDuster);
        Assert.assertTrue(cropDuster.fly(froilanda));
    }

    @Test
    public void cropDusterFertilizeTest(){
        froilanda.operate(cropDuster);
        cropDuster.fly(froilanda);
        Assert.assertTrue(cropDuster.fertilize());
    }

    @Test
    public void cropDusterSwitchOffTest(){
        froilanda.operate(cropDuster);
        cropDuster.fly(froilanda);
        Assert.assertFalse(froilanda.switchOff(cropDuster));
    }
}
