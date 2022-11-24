package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Controller.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Controller.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {

    public boolean mount() {
        return false;
    }
    //REMOVED DISMOUNT AS IT SOUNDED REDUNDANT & CHANGED MOUNT FROM VOID TO BOOLEAN
}
