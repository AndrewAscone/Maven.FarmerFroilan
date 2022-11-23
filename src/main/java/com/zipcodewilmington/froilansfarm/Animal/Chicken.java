package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;

public class Chicken extends Animal<Vegetable> implements Produce, Storage {
    public String makeNoise() {
        return "Cluck";
    }

    public void yield() {

    }

    public boolean hasBeenFertilized() {
        return false;
    }
}
