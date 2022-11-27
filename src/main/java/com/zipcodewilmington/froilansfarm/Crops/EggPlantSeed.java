package com.zipcodewilmington.froilansfarm.Crops;
import com.zipcodewilmington.froilansfarm.Produce.*;
public class EggPlantSeed extends Crop implements Produce<EggPlant> {
    EggPlant eggPlant;
    String name;
    public EggPlantSeed(String name) {
        this.name = name;
    }
    public EggPlant yield() {
        eggPlant = new EggPlant("eggplant");
        if(hasBeenFertilized() && hasBeenHarvested()) {
            return eggPlant;
        }
        return null;
    }
    public boolean hasBeenFertilized() {
        return false;
    }
    public boolean hasBeenHarvested() {
        return false;
    }
    @Override
    public String getName() {
        return name;
    }
    //ADDED EGGPLANT FIELD, EGGPLANTSEED CONSTRUCTOR, FIXED YIELD, HASBEENFERTILIZED & HASBEENHARVESTED(4-19)
    //TOOK OUT <EGGPLANT> FROM CROP (3)
}