package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Shelter.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class FarmerTest {

    Farmer farmer = new Farmer("Froilan",30);
    Tractor tractor = new Tractor("Tractor");
    Horse horse = new Horse("Horse");

    @Test
    public void classInstanceTest() {
        Assert.assertTrue(farmer instanceof Person);
    }
    @Test
    public void classInstanceTest2() {
        Assert.assertTrue(farmer instanceof Botanist);
    }
    @Test
    public void classInstanceTest3() {
        Assert.assertTrue(farmer instanceof Rider);
    }
    @Test
    public void classInstanceTest4() {
        Assert.assertTrue(farmer instanceof FarmVehicle);
    }

    @Test
    public void operateTest() {
        Assert.assertFalse(farmer.operate(tractor));
    }

    @Test
    public void getOperateTest() {
        farmer.operate(tractor);
        Assert.assertFalse(farmer.getOperate());
    }
    @Test
    public void getOperateTest2() {
        Assert.assertTrue(farmer.getOperate());
    }

    @Test
    public void switchOffTest() {
        farmer.operate(tractor);
        Assert.assertFalse(farmer.switchOff(tractor));
    }

    @Test
    public void switchOffTest2() {
        Assert.assertTrue(farmer.switchOff(tractor));
    }

    @Test
    public void mountTest() {
        Assert.assertTrue(farmer.mount(horse));
    }

    @Test
    public void mountTest2() {
        Horse horse2 = new Horse("Charlie");
        farmer.mount(horse);
        Assert.assertTrue(farmer.mount(horse2));
    }

    @Test
    public void dismountTest() {
        farmer.mount(horse);
        Assert.assertTrue(farmer.dismount(horse));
    }
    @Test
    public void dismountTest2() {
        Assert.assertFalse(farmer.dismount(horse));
    }
    @Test
    public void dismountTest3() {
        Horse horse2 = new Horse("Charlie");
        farmer.mount(horse);
        Assert.assertTrue(farmer.dismount(horse2));
    }

    @Test
    public void plantTest() {
        EggPlantSeed eggPlantSeed = new EggPlantSeed("Eggplant Seed");
        CornStalk cornStalk = new CornStalk("Corn Stalk");
        TomatoPlant tomatoPlant = new TomatoPlant("Tomato Plant");
        LettuceSeed lettuceSeed = new LettuceSeed("Lettuce Seed");
        CarrotSeed carrotSeed = new CarrotSeed("Carrot Seed");
        farmer.plant(eggPlantSeed, carrotSeed, cornStalk, lettuceSeed, tomatoPlant);
        Map expected = farmer.plant(eggPlantSeed, carrotSeed, cornStalk, lettuceSeed, tomatoPlant).getCropMap();

        CropRow cropRow = new CropRow();
        cropRow.setCropMap(1, eggPlantSeed);
        cropRow.setCropMap(2, carrotSeed);
        cropRow.setCropMap(3, cornStalk);
        cropRow.setCropMap(4, lettuceSeed);
        cropRow.setCropMap(5, tomatoPlant);
        Map actual = cropRow.getCropMap();

        Assert.assertEquals(expected, actual);
    }
}