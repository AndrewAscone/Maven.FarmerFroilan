package com.zipcodewilmington.froilansfarm.Animal;
import com.zipcodewilmington.froilansfarm.Controller.Rideable;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;

public class Horse extends Animal<Vegetable> implements Rideable, Storage {
    String name;
    Vegetable vegetable;
    public Horse(String name) {
        this.name = name;
    }
    public void eat(Vegetable vegetable) {
        this.vegetable = vegetable;
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

    public String getVegetable(){
        return vegetable.getName();
    }
}