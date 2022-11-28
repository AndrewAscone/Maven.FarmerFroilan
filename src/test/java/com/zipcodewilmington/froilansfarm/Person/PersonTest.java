package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Controller.Eater;
import com.zipcodewilmington.froilansfarm.Controller.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void classInstance() {
        Person person = new Person();
        Assert.assertTrue(person instanceof NoiseMaker);
    }
    @Test
    public void classInstance2() {
        Person person = new Person();
        Assert.assertTrue(person instanceof Eater);
    }
    @Test
    public void classInstance3() {
        Person person = new Person();
        Assert.assertTrue(person instanceof Storage);
    }

    @Test
    public void makeNoise() {
        Person person = new Person();
        Assert.assertEquals(person.makeNoise(),"Hello World!");
    }

    @Test
    public void getName() {
        Person person = new Person();
        person.setName("Test");
        Assert.assertEquals(person.getName(),"Test");
    }

    @Test
    public void setName() {
        Person person = new Person();
        person.setName("Null");
        Assert.assertEquals(person.getName(),"Null");
    }

    @Test
    public void getAge() {
        Person person = new Person();
        person.setAge(30);
        Assert.assertEquals(person.getAge(), 30);
    }

    @Test
    public void setAge() {
        Person person = new Person();
        person.setAge(100);
        Assert.assertEquals(person.getAge(), 100);
    }
}