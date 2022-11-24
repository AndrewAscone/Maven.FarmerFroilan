package com.zipcodewilmington.froilansfarm.Person;

public class Farmer extends Person implements Botanist, Rider{

    public boolean mount() {
        return false;
    }

    public void plant() {

    }
    //REMOVED DISMOUNT AS IT SOUNDED REDUNDANT & CHANGED MOUNT FROM VOID TO BOOLEAN
}
