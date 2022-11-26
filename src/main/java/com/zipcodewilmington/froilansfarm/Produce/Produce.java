package com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Controller.Edible;
public interface Produce<T extends Edible> {
    public T yield();
    public boolean hasBeenFertilized();
}