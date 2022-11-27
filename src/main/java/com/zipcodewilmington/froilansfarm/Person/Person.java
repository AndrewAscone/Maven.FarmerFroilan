package com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.Controller.*;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;
public class Person implements NoiseMaker, Eater<Edible>, Storage {
    String name;
    int age;
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(Edible edible) {
    }
    public String makeNoise() {
        return null;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //ADDED CONSTRUCTOR PASSING NAME & AGE
    //ADDED GETTERS AND SETTERS FOR NAME & AGE

}