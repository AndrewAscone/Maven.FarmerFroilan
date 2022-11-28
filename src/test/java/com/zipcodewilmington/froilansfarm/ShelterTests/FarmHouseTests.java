package com.zipcodewilmington.froilansfarm.ShelterTests;
import com.zipcodewilmington.froilansfarm.Person.Person;
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
        Person person = new Person();
        farmHouse.store(person);
        Assert.assertEquals(farmHouse.release(),person);
    }
    @Test
    public void FarmHouseReleaseTest() {
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Person();
        farmHouse.store(person);
        Assert.assertEquals(farmHouse.release(),person);
    }
}