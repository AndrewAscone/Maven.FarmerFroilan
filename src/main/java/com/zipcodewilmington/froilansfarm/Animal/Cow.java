package com.zipcodewilmington.froilansfarm.Animal;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;

public class Cow extends Animal<Vegetable> implements Storage {
    String name;
    Vegetable vegetable;
    public Cow(String name) {
        this.name = name;
    }
    public String makeNoise() {
        return "Moo";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVegetable(){
        return vegetable.getName();
    }
}
