package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Carrot;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class CarrotSeed extends Crop<Carrot> implements Produce {
    public void yield() {
    }
    public boolean hasBeenFertilized() {
        return false;
    }
    public boolean hasBeenHarvested(Carrot carrot) {
        return false;
    }
}
