package com.zipcodewilmington.froilansfarm.Crops;
import com.zipcodewilmington.froilansfarm.Produce.*;
public class CornStalk extends Crop implements Produce<EarCorn> {
    EarCorn earCorn;
    String name;
    public CornStalk(String name) {
        this.name = name;
    }
    public EarCorn yield() {
        earCorn = new EarCorn("earCorn");
        if(hasBeenHarvested() & hasBeenFertilized()) {
            return earCorn;
        }
        return null;
    }
    public boolean hasBeenFertilized() {
        return false;
    }
    public boolean hasBeenHarvested() {
        return false;
    }
    @Override
    public String getName() {
        return name;
    }
    //ADDED EARCORN FIELD, CORNSTALK CONSTRUCTOR, FIXED YIELD, HASBEENFERTILIZED & HASBEENHARVESTED(4-19)
    //TOOK OUT <EARCORN> FROM CROP (3)
}
