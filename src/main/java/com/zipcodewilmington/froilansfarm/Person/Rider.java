package com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.Controller.Rideable;
interface Rider <T extends Rideable>{
    public boolean mount(T Rideable);
    public boolean dismount(T Rideable);
    //REMOVED DISMOUNT AS IT SOUNDED REDUNDANT & CHANGED MOUNT FROM VOID TO BOOLEAN
    //TOOK OUT
}