package com.zipcodewilmington.froilansfarm.ShelterTests;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.Farm;
import org.junit.Assert;
import org.junit.Test;
public class ChickenCoopTests {
    @Test
    public void chickenCoopIsFarm(){
        ChickenCoop chickenCoop = new ChickenCoop("Chick-Fil-A");
        Assert.assertTrue(chickenCoop instanceof Farm);
    }
    @Test
    public void chickenCoopStoreTest(){
        ChickenCoop chickenCoop = new ChickenCoop("Chick-Fil-A");
        Chicken chicken = new Chicken();
        chickenCoop.store(chicken);
        Assert.assertEquals(chickenCoop.getChicken(),chicken);
    }
    @Test
    public void chickenCoopGetNameTest(){
        ChickenCoop chickenCoop = new ChickenCoop("Chick-Fil-A");
        Assert.assertEquals(chickenCoop.getName(),"Chick-Fil-A");
    }
}
