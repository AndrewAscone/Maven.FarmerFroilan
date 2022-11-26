package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Crops.*;
import java.util.Map;
public class CropRow extends Field implements Storage {
    //considering set crop as key and integer as value;
    Map<Integer, Crop> cropMap;
    public CropRow(Map<Integer, Crop> cropMap) {
        this.cropMap = cropMap;
    }
    public void sow(Crop crop1, Crop crop2, Crop crop3, Crop crop4, Crop crop5) {
        cropMap.put(1, crop1);
        cropMap.put(2, crop2);
        cropMap.put(3, crop3);
        cropMap.put(4, crop4);
        cropMap.put(5, crop5);
    }
    //ADDED FIELD (6-10)
    //ADDED CONSTRUCTOR CROPROW (11-13)
    //ADDED METHOD SOW(14-19)
}