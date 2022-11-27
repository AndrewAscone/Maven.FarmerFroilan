package com.zipcodewilmington.froilansfarm.Animal;
import com.zipcodewilmington.froilansfarm.Controller.*;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;

public abstract class Animal <T extends Edible> implements Eater<Vegetable>, NoiseMaker {
    public void eat(Vegetable vegetable) {
    }
}
