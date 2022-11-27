package com.zipcodewilmington.froilansfarm.Crops;
import com.zipcodewilmington.froilansfarm.Produce.*;
public class TomatoPlant extends Crop implements Produce<Tomato> {
    Tomato tomato;
    String name;
    public TomatoPlant(String name) {
        this.name = name;
    }
    public Tomato yield() {
        tomato = new Tomato("tomato");
        if(hasBeenFertilized() & hasBeenHarvested()) {
            return tomato;
        }
        return null;
    }
    public boolean hasBeenFertilized() {
        return false;
    }
    public boolean hasBeenHarvested() {
        return false;
    }
    public String getName() {
        return name;
    }
    //ADDED TOMATO FIELD, TOMATOPLANT CONSTRUCTOR, FIXED YIELD, HASBEENFERTILIZED & HASBEENHARVESTED(4-19)
    //TOOK OUT <TOMATO> FROM CROP (3)
}