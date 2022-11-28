package com.zipcodewilmington.froilansfarm.ShelterTests;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Shelter.Farm;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;
import org.junit.Assert;
import org.junit.Test;

public class StableTests {
    @Test
    public void stableIsFarmTest(){
        Stable stable = new Stable(1);
        Assert.assertTrue(stable instanceof Farm);
    }

    @Test
    public void stableStoreTest(){
        Horse horse1 = new Horse("Horse");
        Horse horse2 = new Horse("Charlie");
        Stable stable = new Stable(1);
        stable.store(horse2);
        Assert.assertEquals(stable.getHorseName(0),"Charlie");
    }
    @Test
    public void stableGetHorseNameTest() {
        Horse horse1 = new Horse("Horse");
        Horse horse2 = new Horse("Charlie");
        Stable stable = new Stable(horse1, horse2);
        Assert.assertEquals(stable.getHorseName(1),"Charlie");
    }
    @Test
    public void stableReleaseTest() {
        Horse horse1 = new Horse("Horse");
        Horse horse2 = new Horse("Charlie");
        Stable stable = new Stable(horse1, horse2);
        Assert.assertEquals(stable.release(1).getName(), "Charlie");
    }
    @Test
    public void getHorseObjectTest() {
        Stable stable = new Stable(1);
        Assert.assertEquals(stable.getHorseObject(0),null);
    }
    @Test
    public void getHorseLocationTest(){
        Horse horse1 = new Horse("Horse");
        Horse horse2 = new Horse("Charlie");
        Stable stable = new Stable(horse1, horse2);
        Assert.assertEquals(stable.getHorseLocation(horse2),1);
    }
}
