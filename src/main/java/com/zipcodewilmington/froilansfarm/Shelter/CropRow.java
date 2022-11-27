package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Crops.*;
import java.util.Map;
import java.util.TreeMap;

public class CropRow extends Field implements Storage {
    //considering set crop as key and integer as value;
    Map<Integer, Crop> cropMap;
    public CropRow() {
        cropMap = new TreeMap<>();
    }
    public Map<Integer, Crop> getCropMap() {
        return cropMap;
    }
    public void setCropMap(Integer num, Crop crop) {
        this.cropMap.put(num, crop);
    }
    //ADDED FIELD (6-10)
    //ADDED CONSTRUCTOR CROPROW (11-13)
    //ADDED METHOD SOW(14-19)
}