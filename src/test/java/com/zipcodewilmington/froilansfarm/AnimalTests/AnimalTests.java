package com.zipcodewilmington.froilansfarm.AnimalTests;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Controller.Eater;
import com.zipcodewilmington.froilansfarm.Controller.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTests {

    @Test
    public void animalIsEaterTest(){
        Animal<Vegetable> horse = new Horse("Test");

        Assert.assertTrue(horse instanceof Eater<?>);

    }

    @Test
    public void animalIsNoisemakerTest(){

        Animal<Vegetable> chicken = new Chicken();

        Assert.assertTrue(chicken instanceof NoiseMaker);

    }

}
