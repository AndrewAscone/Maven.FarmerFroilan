package com.zipcodewilmington.froilansfarm.Vehicle;

public interface FarmVehicle<T extends Vehicle> {

    public void operate();

    //CHANGED FARMVEHICLE TO INTERFACE SO IT CAN BE IMPLEMENTED INSTEAD OF EXTENDED
}
