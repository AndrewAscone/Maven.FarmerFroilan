package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Controller.Edible;
import com.zipcodewilmington.froilansfarm.Controller.Rideable;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;

public class Horse extends Animal<Vegetable> implements Rideable, Storage {

    public void eat(Vegetable vegetable) {

    }

    public String makeNoise() {
        return "Neigh";
    }
}
