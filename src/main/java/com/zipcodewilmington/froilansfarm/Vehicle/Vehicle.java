package com.zipcodewilmington.froilansfarm.Vehicle;
import com.zipcodewilmington.froilansfarm.Controller.*;
public abstract class Vehicle implements NoiseMaker {
    public boolean mount() {
        return false;
    }
    //REMOVED DISMOUNT AS IT SOUNDED REDUNDANT & CHANGED MOUNT FROM VOID TO BOOLEAN
}