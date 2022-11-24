package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;

public class Pilot implements Rider<Aircraft>, FarmVehicle<CropDuster> {
    public boolean mount() {
        return false;
    }
    public void operate() {

    }
    //REMOVED DISMOUNT AS IT SOUNDED REDUNDANT & CHANGED MOUNT FROM VOID TO BOOLEAN
}
