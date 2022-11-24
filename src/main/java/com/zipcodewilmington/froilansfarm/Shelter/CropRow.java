package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Crops.Crop;

import java.util.Map;

public class CropRow extends Field implements Storage {
    Map<Integer, Crop> cropMap;
    public CropRow(Map<Integer, Crop> cropMap) {
        this.cropMap = cropMap;
    }
    //ADDED MAP CROPMAP IN FIELD (8)
    //ADDED CONSTRUCTOR CROPROW (9-11)
}
