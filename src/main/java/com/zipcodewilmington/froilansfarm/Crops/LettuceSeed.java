package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Lettuce;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class LettuceSeed extends Crop<Lettuce> implements Produce {
    public void yield() {
    }
    public boolean hasBeenFertilized() {
        return false;
    }
    public boolean hasBeenHarvested(Lettuce lettuce) {
        return false;
    }
}
