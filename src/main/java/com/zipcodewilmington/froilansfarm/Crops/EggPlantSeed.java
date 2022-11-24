package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.EggPlant;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class EggPlantSeed extends Crop<EggPlant> implements Produce {
    public void yield() {
    }
    public boolean hasBeenFertilized() {
        return false;
    }
    public boolean hasBeenHarvested(EggPlant plantEgg) {
        return false;
    }
}
