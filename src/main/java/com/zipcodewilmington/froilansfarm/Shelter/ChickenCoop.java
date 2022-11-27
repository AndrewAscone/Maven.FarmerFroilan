package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
public class ChickenCoop extends Farm<Chicken>{
    Chicken chicken;
    public ChickenCoop(){
    }
    public void store(Chicken chicken) {

    }
    public Chicken release() {
        return chicken;
    }
    //ADDED CONSTRUCTOR (5-6)
    //ADDED METHOD STORE (7-8)
    //ADDED METHOD RELEASE() (10-12)
}