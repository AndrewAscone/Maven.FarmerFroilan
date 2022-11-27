package com.zipcodewilmington.froilansfarm.Vehicle;
public interface FarmVehicle<T extends Vehicle> {
    public boolean operate(T object);
    public boolean switchOff(T object);
    //CHANGED FARMVEHICLE TO INTERFACE SO IT CAN BE IMPLEMENTED INSTEAD OF EXTENDED
}