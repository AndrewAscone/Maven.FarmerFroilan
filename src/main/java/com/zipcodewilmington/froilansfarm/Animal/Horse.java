package com.zipcodewilmington.froilansfarm.Animal;
import com.zipcodewilmington.froilansfarm.Controller.Edible;
import com.zipcodewilmington.froilansfarm.Controller.Rideable;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;

public class Horse extends Animal<Vegetable> implements Rideable, Storage {
    String name;
    Vegetable vegetable;
    public Horse(String name) {
        this.name = name;
    }
    public Vegetable eat(Vegetable vegetable) {
        this.vegetable = vegetable;
        return null;
    }
    public String makeNoise() {
        return "Neigh";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}