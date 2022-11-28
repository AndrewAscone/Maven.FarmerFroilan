package com.zipcodewilmington.froilansfarm.Shelter;
public class Field extends Farm <CropRow>{
    CropRow cropRow;
    public Field() {
    }
    public void store(CropRow cropRow) {
        this.cropRow = cropRow;
    }
    public CropRow getCropRow() {
        return cropRow;
    }
    //ADDED STORE METHOD (6-8)
    //ADDED FIELD CONSTRUCTOR (3-5)
}