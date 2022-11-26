package com.zipcodewilmington.froilansfarm.Crops;
import com.zipcodewilmington.froilansfarm.Produce.*;
public class CarrotSeed extends Crop implements Produce<Carrot> {
    Carrot carrot;
    public CarrotSeed() {
    }
    public Carrot yield() {
        this.carrot = new Carrot("carrot");
        if(hasBeenFertilized() && hasBeenHarvested()) {
            return this.carrot;
        }
        return null;
    }
    public boolean hasBeenFertilized() {
        return false;
    }
    public boolean hasBeenHarvested() {
        return false;
    }
    //ADDED CARROT FIELD, CARROTSEED CONSTRUCTOR, FIXED YIELD, HASBEENFERTILIZED & HASBEENHARVESTED(4-19)
    //TOOK OUT <CARROT> FROM CROP (3)
}
