package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Controller.Eater;
import com.zipcodewilmington.froilansfarm.Controller.Edible;
import com.zipcodewilmington.froilansfarm.Controller.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Shelter.Storage;

public class Person implements NoiseMaker, Eater<Edible>, Storage {

    public void eat(Edible edible) {

    }

    public String makeNoise() {
        return null;
    }
}
