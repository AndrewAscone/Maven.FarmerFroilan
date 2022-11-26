package com.zipcodewilmington.froilansfarm.Crops;
import com.zipcodewilmington.froilansfarm.Produce.*;
public class TomatoPlant extends Crop implements Produce<Tomato> {
    Tomato tomato;
    public TomatoPlant() {
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
    //ADDED TOMATO FIELD, TOMATOPLANT CONSTRUCTOR, FIXED YIELD, HASBEENFERTILIZED & HASBEENHARVESTED(4-19)
    //TOOK OUT <TOMATO> FROM CROP (3)
}