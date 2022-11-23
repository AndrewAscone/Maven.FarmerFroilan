package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Controller.Edible;

public interface Produce extends Edible {

    public void yield();

    public boolean hasBeenFertilized();

}
