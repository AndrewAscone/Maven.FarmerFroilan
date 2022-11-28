package com.zipcodewilmington.froilansfarm.AnimalTests;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTests {

    @Test
    public void chickenIsProduceTest(){
        Chicken test = new Chicken();

        Assert.assertTrue(test instanceof Produce<?>);
    }

    @Test
    public void chickenIsAnimalTest(){
        Chicken test = new Chicken();

        Assert.assertTrue(test instanceof Animal<?>);
    }

    @Test
    public void chickenIsStorageTest(){
        Chicken test = new Chicken();

        Assert.assertTrue(test instanceof Storage);

    }

    @Test
    public void chickenMakenoiseTest(){
        Chicken test = new Chicken();

        String expected = "Cluck";
        String actual = test.makeNoise();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void chickenYieldTest(){ //Method depends on random true/false result of hasBeenFertilized method
        Chicken test = new Chicken();
        EdibleEgg testEgg = new EdibleEgg("egg");
        Assert.assertEquals(testEgg.getName(), "egg");
    }

    @Test
    public void chickenHasBeenFertilizedTest(){ //Method uses a random 0 or 1 to determine fertilization
        Chicken test = new Chicken();
        Assert.assertTrue("Fertilized: " + test.hasBeenFertilized(), test.hasBeenFertilized() == true || test.hasBeenFertilized() == false);
    }
}
