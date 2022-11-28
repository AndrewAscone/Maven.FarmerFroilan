package com.zipcodewilmington.froilansfarm.Animal;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;

import java.util.Random;

public class Chicken extends Animal<Vegetable> implements Produce<EdibleEgg>, Storage {
    EdibleEgg edibleEgg;
    Vegetable vegetable;
    public Chicken(){
    }
    public String makeNoise() {
        return "Cluck";
    }
    public EdibleEgg yield() {
        this.edibleEgg = new EdibleEgg("egg");
        if(hasBeenFertilized()) {
            try {
                return null;

            } catch (NullPointerException e) {
                System.out.println("Eggs aren't edible");
            }
        }
        return this.edibleEgg;
    }
    public boolean hasBeenFertilized() {
        Random random = new Random();
        int fertilizedFlag = random.nextInt(2);
        if(fertilizedFlag == 0){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String getName() {
        return null;
    }
    @Override
    public void eat(Vegetable vegetable) {
        this.vegetable = vegetable;
    }
}