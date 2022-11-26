package com.zipcodewilmington.froilansfarm.Animal;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;
public class Chicken extends Animal<Vegetable> implements Produce<EdibleEgg>, Storage {
    EdibleEgg edibleEgg;
    Vegetable vegetable;
    public String makeNoise() {
        return "Cluck";
    }
    public EdibleEgg yield() {
        this.edibleEgg = new EdibleEgg("egg");
        if(!hasBeenFertilized()) {
            return this.edibleEgg;
        }
        return null;
    }
    public boolean hasBeenFertilized() {
        return false;
    }
    @Override
    public Vegetable eat(Vegetable vegetable) {
        this.vegetable = vegetable;
        return null;
    }
}