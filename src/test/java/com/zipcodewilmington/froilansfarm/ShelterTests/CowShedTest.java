package com.zipcodewilmington.froilansfarm.ShelterTests;

import com.zipcodewilmington.froilansfarm.Animal.Cow;
import com.zipcodewilmington.froilansfarm.Shelter.CowShed;
import com.zipcodewilmington.froilansfarm.Shelter.Farm;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CowShedTest {
 @Test
    public void cowShedOneCowConstructorTest(){
        Cow test1 = new Cow("Bessie");
        Cow test2 = new Cow("Buttercup");
        CowShed test = new CowShed(test1, test2);

        String expected = "Bessie, Buttercup";
        String actual = test.getCowName(0) + ", " + test.getCowName(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cowShedTwoCowConstructorTest(){
        Cow test1 = new Cow("Zavala");
        Cow test2 = new Cow("Ikora");
        Cow test3 = new Cow("Cayde");
        CowShed test = new CowShed(test1, test2, test3);

        String expected = "Zavala, Ikora, Cayde";
        String actual = test.getCowName(0) + ", " + test.getCowName(1) + ", " + test.getCowName(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cowShedFiveCowConstructorTest(){
        Cow test1 = new Cow("Junkrat");
        Cow test2 = new Cow("Hanzo");
        Cow test3 = new Cow("Mercy");
        Cow test4 = new Cow("Brigitte");
        Cow test5 = new Cow("Winston");
        CowShed test = new CowShed(test1, test2, test3, test4, test5);

        String expected = "Junkrat, Hanzo, Mercy, Brigitte, Winston";
        String actual = test.getCowName(0) + ", " + test.getCowName(1) + ", " +
                test.getCowName(2) + ", " + test.getCowName(3) + ", " +
                test.getCowName(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cowShedIsFarmTest(){
        Cow test1 = new Cow("Test");
        Cow test2 = new Cow("Test2");
        CowShed test = new CowShed(test1, test2);

        Assert.assertTrue(test instanceof Farm<?>);
    }

    @Test
    public void cowStoreTest(){
        Cow cow1 = new Cow("Cow");
        Cow cow2 = new Cow("Charlie");
        CowShed cowShed = new CowShed(1);
        cowShed.store(cow2);
        Assert.assertEquals(cowShed.getCowName(0),"Charlie");
    }

    @Test
    public void cowShedGetCowNameTest() {
        Cow cow1 = new Cow("Cow");
        Cow cow2 = new Cow("Charlie");
        CowShed cowShed = new CowShed(cow1, cow2);
        Assert.assertEquals(cowShed.getCowName(1),"Charlie");
    }

    @Test
    public void cowShedReleaseTest() {
        Cow cow1 = new Cow("Cow");
        Cow cow2 = new Cow("Charlie");
        CowShed cowShed = new CowShed(cow1, cow2);
        Assert.assertEquals(cowShed.release(1).getName(), "Charlie");
    }

    @Test
    public void getCowObjectTest() {
        CowShed cowShed = new CowShed(1);
        Assert.assertEquals(cowShed.getCowObject(0),null);
    }

    @Test
    public void getCowLocationTest(){
        Cow cow1 = new Cow("Cow");
        Cow cow2 = new Cow("Charlie");
        CowShed cowShed = new CowShed(cow1, cow2);
        Assert.assertEquals(cowShed.getCowLocation(cow2),1);
    }

    @Test
    public void getCowShedSize() {
        Cow cow1 = new Cow("Cow");
        Cow cow2 = new Cow("Charlie");
        CowShed cowShed = new CowShed(cow1, cow2);
        Assert.assertEquals(cowShed.getCowShedSize(),2);
    }
}