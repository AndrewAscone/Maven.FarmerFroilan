package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Person.Farmer;

public class Tractor extends Vehicle{
    String name;
    boolean harvestResult;
    public Tractor() {
    }
    public Tractor(String name) {
        this.name = name;
    }
    public String makeNoise() {
        return "Rawr";
    }
    public boolean harvest(Farmer farmer) {
        Tractor tractor = new Tractor("Tractor");
        if(!farmer.getOperate()) {
            System.out.printf("\033[1;95m%s has harvested all crops.\033[0m\n",tractor.getName());
            return harvestResult = true;
        } else {
            System.out.printf("\033[1;95m%s is not currently operating.\033[0m\n",tractor.getName());
        }
        return harvestResult = false;
    }
    public String getName() {
        return this.name;
    }
    //ADDED HARVEST METHOD & SET TYPE TO BOOLEAN (10-12)
    //ADDED CONSTRUCTOR (4-6)
}