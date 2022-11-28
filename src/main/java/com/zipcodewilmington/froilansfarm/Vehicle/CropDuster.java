package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Person.Pilot;

public class CropDuster extends Vehicle implements Aircraft {
    String name;
    boolean flyResult = false;
    boolean fertilizeResult = false;
    public CropDuster() {
    }
    public CropDuster(String name) {
        this.name = name;
    }
    public String makeNoise() {
        return "Brrr";
    }
    public boolean fly(Pilot pilot) {
        CropDuster cropDuster = new CropDuster("Crop Duster");
        if(!pilot.getOperate()) {
            System.out.printf("\033[1;95m%s has taken flight.\033[0m\n",cropDuster.getname());
            return flyResult = true;
        } else {
            System.out.printf("\033[1;95m%s is not currently operating.\033[0m\n",cropDuster.getname());
        }
        return flyResult = false;
    }
    public boolean fertilize() {
        if(getFlyResult()) {
            System.out.println("\033[1;95mAll of the crop rows have been fertilized.\033[0m");
            return fertilizeResult = true;
        } else {
            System.out.printf("\033[1;95m%s is not flying.\033[0m",getname());
        }
        return fertilizeResult = false;
    }
    @Override
    public String getname() {
        return this.name;
    }
    public boolean getFlyResult() {
        return flyResult;
    }
    public boolean getFertilizeResult() {
        return fertilizeResult;
    }
    //ADDED CROPDUSTER CONSTRUCTOR (7-9)
    //ADDED METHOD FERTILIZE() (11-13)
}