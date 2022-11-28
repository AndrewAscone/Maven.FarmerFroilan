package com.zipcodewilmington.froilansfarm.ShelterTests;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Shelter.Farm;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;
import org.junit.Assert;
import org.junit.Test;

public class StableTests {
    @Test
    public void stableTwoHorseConstructorTest(){
        Horse test1 = new Horse("Banjo");
        Horse test2 = new Horse("Kazooie");
        Stable test = new Stable(test1, test2);

        String expected = "Banjo, Kazooie";
        String actual = test.getHorseName(0) + ", " + test.getHorseName(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stableThreeHorseConstructorTest(){
        Horse test1 = new Horse("Zavala");
        Horse test2 = new Horse("Ikora");
        Horse test3 = new Horse("Cayde");
        Stable test = new Stable(test1, test2, test3);

        String expected = "Zavala, Ikora, Cayde";
        String actual = test.getHorseName(0) + ", " + test.getHorseName(1) + ", " + test.getHorseName(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stableFiveHorseConstructorTest(){
        Horse test1 = new Horse("Junkrat");
        Horse test2 = new Horse("Hanzo");
        Horse test3 = new Horse("Mercy");
        Horse test4 = new Horse("Brigitte");
        Horse test5 = new Horse("Winston");
        Stable test = new Stable(test1, test2, test3, test4, test5);

        String expected = "Junkrat, Hanzo, Mercy, Brigitte, Winston";
        String actual = test.getHorseName(0) + ", " + test.getHorseName(1) + ", " +
                test.getHorseName(2) + ", " + test.getHorseName(3) + ", " +
                test.getHorseName(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stableIsFarmTest(){
        Horse test1 = new Horse("Test");
        Horse test2 = new Horse("Test2");
        Stable test = new Stable(test1, test2);

        Assert.assertTrue(test instanceof Farm<?>);
    }

    @Test
    public void stableStoreTest(){

    }
}
