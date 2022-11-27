package com.zipcodewilmington.froilansfarm.Crops;
import com.zipcodewilmington.froilansfarm.Produce.*;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;

public class LettuceSeed extends Crop implements Produce<Lettuce> {
    Lettuce lettuce;
    String name;
    public LettuceSeed(String name) {
        this.name = name;
    }
    public Lettuce yield() {
        lettuce = new Lettuce("lettuce");
        if(hasBeenFertilized() && hasBeenHarvested()) {
            return lettuce;
        }
        return null;
    }
    public boolean hasBeenFertilized() {
        CropDuster cropDuster = new CropDuster();
        if(cropDuster.fertilize()) {
            System.out.println();
            return true;
        }
        System.out.println();
        return false;
    }
    public boolean hasBeenHarvested() {
        return false;
    }
    public String getName() {
        return name;
    }
    //ADDED LETTUCE FIELD, LETTUCESEED CONSTRUCTOR, FIXED YIELD, HASBEENFERTILIZED & HASBEENHARVESTED(4-19)
    //TOOK OUT <LETTUCE> FROM CROP (3)
}