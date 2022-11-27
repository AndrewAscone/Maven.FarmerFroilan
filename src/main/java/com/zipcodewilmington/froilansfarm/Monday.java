package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;

public class Monday {
    Pilot froilanda = new Pilot("Froilanda", 28);
    CropDuster cropDuster = new CropDuster("Crop Duster");
    public Monday() {
    }
    public void prompt() {
        System.out.println("\033[0;107m\033[1;91m\t\tMonday Routine for CALM Farm\t\t\033[0m\n");
        cropDusterOperate();
        cropDusterFly();
        cropDusterFertilize();
        cropDusterSwitchOff();
        System.out.println("\n\033[0;107m\033[1;91m\t\tEnd of Monday\t\t\033[0m\n");
    }
    public boolean cropDusterOperate() {
        return froilanda.operate(cropDuster);
    }
    public boolean cropDusterFly() {
        return cropDuster.fly(froilanda);
    }
    public boolean cropDusterFertilize() {
        return cropDuster.fertilize();
    }
    public boolean cropDusterSwitchOff() {
        return froilanda.switchOff(cropDuster);
    }
}