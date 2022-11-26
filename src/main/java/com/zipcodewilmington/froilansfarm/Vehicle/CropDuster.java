package com.zipcodewilmington.froilansfarm.Vehicle;
public class CropDuster extends Vehicle implements Aircraft {
    CropDuster() {
    }
    public String makeNoise() {
        return null;
    }
    public boolean fly() {
        return false;
    }
    public boolean fertilize() {
        return false;
    }
    //ADDED CROPDUSTER CONSTRUCTOR (7-9)
    //ADDED METHOD FERTILIZE() (11-13)
}