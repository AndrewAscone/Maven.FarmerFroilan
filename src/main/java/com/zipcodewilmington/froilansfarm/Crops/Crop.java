package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Controller.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class Crop <T extends Vegetable> {

    public boolean hasBeenHarvested(T object) {
        return false;
    }
    //CHANGED FROM EXTENDS PRODUCE TO EXTENDS VEGETABLE
}
