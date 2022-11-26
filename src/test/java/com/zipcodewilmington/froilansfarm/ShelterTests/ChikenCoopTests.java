package com.zipcodewilmington.froilansfarm.ShelterTests;

import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.Farm;
import org.junit.Assert;
import org.junit.Test;

public class ChikenCoopTests {
    @Test
    public void chikenCoopIsFarm(){
        ChickenCoop cc = new ChickenCoop();

        Assert.assertTrue(cc instanceof Farm);
    }

    @Test
    public void chikenCoopContrutorTest(){

    }

    @Test
    public void chkenCoopStoreTest(){

    }
}
