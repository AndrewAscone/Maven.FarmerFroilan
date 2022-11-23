package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Produce.EarCorn;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class CornStalk extends Crop<EarCorn> implements Produce {
    public void yield() {
    }
    public boolean hasBeenFertilized() {
        return false;
    }
    public boolean hasBeenHarvested(EarCorn earCorn) {
        return false;
    }
}
