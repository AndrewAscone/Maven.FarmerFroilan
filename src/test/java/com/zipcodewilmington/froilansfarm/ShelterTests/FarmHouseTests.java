package com.zipcodewilmington.froilansfarm.ShelterTests;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Shelter.Farm;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTests {
    @Test
    public void FarmHouseIsFarmTest(){
        FarmHouse farmHouse = new FarmHouse();
        Assert.assertTrue(farmHouse instanceof Farm);
    }
    @Test
    public void FarmHouseStoreTest() {
        FarmHouse farmHouse = new FarmHouse();
        Pilot person = new Pilot("Name", 30);
        Farmer farmer = new Farmer("Test", 40);
        farmHouse.store(farmer, person);
        Assert.assertEquals(farmHouse.leave(person),person);
    }
    @Test
    public void FarmHouseReleaseTest() {
        FarmHouse farmHouse = new FarmHouse();
        Pilot person = new Pilot("Name", 30);
        Farmer farmer = new Farmer("Test", 40);
        farmHouse.store(farmer, person);
        Assert.assertEquals(farmHouse.leave(person),person);
    }
}