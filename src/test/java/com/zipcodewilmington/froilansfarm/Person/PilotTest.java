package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {

    @Test
    public void classInstance() {
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof Person);
    }
    @Test
    public void classInstance2() {
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof Rider);
    }
    @Test
    public void classInstance3() {
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof FarmVehicle);
    }

    @Test
    public void operate() {
        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster("CropDuster");
        Assert.assertFalse(pilot.operate(cropDuster));
    }

    @Test
    public void getOperate() {
        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster("CropDuster");
        pilot.operate(cropDuster);
        Assert.assertFalse(pilot.getOperate());
    }
    @Test
    public void getOperate2() {
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot.getOperate());
    }

    @Test
    public void switchOff() {
        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster("CropDuster");
        Assert.assertTrue(pilot.switchOff(cropDuster));
    }
    @Test
    public void switchOff2() {
        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster("CropDuster");
        pilot.operate(cropDuster);
        Assert.assertFalse(pilot.switchOff(cropDuster));
    }

    @Test
    public void mount() {
        Pilot pilot = new Pilot();
        Horse horse = new Horse("Horse");
        Assert.assertTrue(pilot.mount(horse));
    }
    @Test
    public void mount2() {
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot.mount);
    }
    @Test
    public void mount3() {
        Pilot pilot = new Pilot();
        Horse horse = new Horse("Horse");
        Horse horse2 = new Horse("Horse2");
        pilot.mount(horse);
        Assert.assertTrue(pilot.mount(horse2));
    }

    @Test
    public void dismount() {
        Pilot pilot = new Pilot();
        Assert.assertFalse(pilot.dismount);
    }
    @Test
    public void dismount2() {
        Pilot pilot = new Pilot();
        Horse horse = new Horse("horse");
        Assert.assertFalse(pilot.dismount(horse));
    }
    @Test
    public void dismount3() {
        Pilot pilot = new Pilot();
        Horse horse = new Horse("horse");
        pilot.mount(horse);
        Assert.assertTrue(pilot.dismount(horse));
    }
}