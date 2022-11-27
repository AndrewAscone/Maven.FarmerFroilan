package com.zipcodewilmington.froilansfarm.AnimalTests;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import com.zipcodewilmington.froilansfarm.Produce.Carrot;
import org.junit.Assert;
import org.junit.Test;

public class HorseTests {
    @Test
    public void horseConstrutorTest(){

    }

    @Test
    public void horseIsAnimalTest(){

    }

    @Test
    public void horseIsRideableTest(){

    }

    @Test
    public void horseStorageTest(){

    }

    @Test
    public void horseEatTest(){
        Horse test = new Horse("Test");
        Carrot testFood = new Carrot("carrot");

        Assert.assertNull(test.eat(testFood));

    }

    @Test
    public void horseMakenoiseTest(){
        Horse test = new Horse("Test");

        String expected = ("Neigh");
        String actual = test.makeNoise();

        Assert.assertEquals(expected, actual);

    }
}
