package com.zipcodewilmington.froilansfarm.Animal;
import com.zipcodewilmington.froilansfarm.Controller.Eater;
import com.zipcodewilmington.froilansfarm.Controller.Edible;
import com.zipcodewilmington.froilansfarm.Controller.NoiseMaker;

public abstract class Animal <T extends Edible> implements Eater<T>, NoiseMaker {

    public void eat(T edible) {

    }
}
