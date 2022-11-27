package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Shelter.CropRow;

public interface Botanist {
    public CropRow plant(Crop crop1, Crop crop2, Crop crop3, Crop crop4, Crop crop5);
}