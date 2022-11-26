package com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Controller.Edible;
public class EdibleEgg implements Edible {
    String name;
    public EdibleEgg(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}