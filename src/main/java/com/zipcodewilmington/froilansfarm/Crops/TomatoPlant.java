package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;

public class TomatoPlant extends Crop<Tomato> implements Produce {
    public void yield() {
    }
    public boolean hasBeenFertilized() {
        return false;
    }
    public boolean hasBeenHarvested(Tomato tomato) {
        return false;
    }
}
