package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class Crop <T extends Produce> {

    public boolean hasBeenHarvested(T object) {
        return false;
    }
}
