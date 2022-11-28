package com.zipcodewilmington.froilansfarm.AnimalTests;
import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Animal.Cow;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;
import org.junit.Assert;
import org.junit.Test;
public class CowTest {

    @Test
        public void cowConstructorTest(){
            Cow test = new Cow("Test");

            String expected = "Test";
            String actual = test.getName();

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void cowIsAnimalTest(){
            Cow test = new Cow("Test");

            Assert.assertTrue(test instanceof Animal<?>);
        }

        @Test
        public void cowStorageTest(){
            Cow test = new Cow("Test");

            Assert.assertTrue(test instanceof Storage);
        }

        @Test
        public void cowMakenoiseTest(){
            Cow test = new Cow("Test");

            String expected = ("Moo");
            String actual = test.makeNoise();

            Assert.assertEquals(expected, actual);

        }

}