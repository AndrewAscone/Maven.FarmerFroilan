package com.zipcodewilmington.froilansfarm.Vehicle;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import org.junit.Assert;
import org.junit.Test;
public class TractorTest {
    @Test
    public void classInstanceTest() {
        Tractor tractor = new Tractor("Tractor");
        Assert.assertTrue(tractor instanceof Vehicle);
    }
    @Test
    public void makeNoiseTest() {
        Tractor tractor = new Tractor("Tractor");
        Assert.assertEquals(tractor.makeNoise(),"Rawr");
    }
    @Test
    public void harvestTest() {
        Tractor tractor = new Tractor("Tractor");
        Farmer froilan = new Farmer("Froilan", 30);
        Assert.assertFalse(tractor.harvest(froilan));
    }
    @Test
    public void harvestTest2() {
        Tractor tractor = new Tractor("Tractor");
        Farmer froilan = new Farmer("Froilan", 30);
        froilan.operate(tractor);
        Assert.assertTrue(tractor.harvest(froilan));
    }
    @Test
    public void getNameTest() {
        Tractor tractor = new Tractor("Tractor");
        Assert.assertEquals(tractor.getName(), "Tractor");
    }
}