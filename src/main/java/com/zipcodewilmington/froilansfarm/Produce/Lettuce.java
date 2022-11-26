package com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
public class Lettuce implements Vegetable {
    String name;
    public String getName() {
        return name;
    }
    public Lettuce(String name) {
        this.name = name;
    }
    //GOT RID OF IMPLEMENTS PRODUCE
    //THIS WAY, WE ARE NOT FORCED TO USE YIELD() & HASBEENFERTILIZED() FROM PRODUCE
    //ALSO, I THINK IT MAKES MORE SENSE
}