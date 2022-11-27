package com.zipcodewilmington.froilansfarm.Crops;
public class Crop {
    String name;
    public boolean hasBeenHarvested() {
        return false;
    }
    //CHANGED FROM EXTENDS PRODUCE TO EXTENDS VEGETABLE
    //TOOK OUT GENERIC<T EXTENDS VEGETABLE> FROM CROP
    public String getName(){
        return name;
    }
}