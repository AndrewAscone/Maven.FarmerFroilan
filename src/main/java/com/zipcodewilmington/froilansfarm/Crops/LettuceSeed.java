package com.zipcodewilmington.froilansfarm.Crops;
import com.zipcodewilmington.froilansfarm.Produce.*;
public class LettuceSeed extends Crop implements Produce<Lettuce> {
    Lettuce lettuce;
    public LettuceSeed() {
    }
    public Lettuce yield() {
        lettuce = new Lettuce("lettuce");
        if(hasBeenFertilized() && hasBeenHarvested()) {
            return lettuce;
        }
        return null;
    }
    public boolean hasBeenFertilized() {
        return false;
    }
    public boolean hasBeenHarvested() {
        return false;
    }
    //ADDED LETTUCE FIELD, LETTUCESEED CONSTRUCTOR, FIXED YIELD, HASBEENFERTILIZED & HASBEENHARVESTED(4-19)
    //TOOK OUT <LETTUCE> FROM CROP (3)
}