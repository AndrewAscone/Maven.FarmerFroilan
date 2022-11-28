package com.zipcodewilmington.froilansfarm.AnimalTests;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Controller.Rideable;
import com.zipcodewilmington.froilansfarm.Produce.Carrot;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;
import org.junit.Assert;
import org.junit.Test;

public class HorseTests {
    @Test
    public void horseConstrutorTest(){
        Horse test = new Horse("Test");

        String expected = "Test";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void horseIsAnimalTest(){
        Horse test = new Horse("Test");

        Assert.assertTrue(test instanceof Animal<?>);
    }

    @Test
    public void horseIsRideableTest(){
        Horse test = new Horse("Test");

        Assert.assertTrue(test instanceof Rideable);
    }

    @Test
    public void horseStorageTest(){
        Horse test = new Horse("Test");

        Assert.assertTrue(test instanceof Storage);
    }

    @Test
    public void horseEatTest(){
        Horse test = new Horse("Test");
        Carrot testFood = new Carrot("carrot");

        test.eat(testFood);
        String expected = "carrot";
        String actual = test.getVegetable();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void horseMakenoiseTest(){
        Horse test = new Horse("Test");

        String expected = ("Neigh");
        String actual = test.makeNoise();

        Assert.assertEquals(expected, actual);

    }
}
