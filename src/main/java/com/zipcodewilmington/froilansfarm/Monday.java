package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;

public class Monday {
    FarmHouse house = new FarmHouse();
    Farmer froilan = (Farmer) house.getPersonObject(0);
    Pilot froilanda = (Pilot) house.getPersonObject(1);
    MorningRoutine morningRoutine = new MorningRoutine();
    CropDuster cropDuster = new CropDuster("Crop Duster");
    public Monday() {
    }
    public void activities() {
        System.out.println("\033[0;107m\033[1;91m\t\tMonday Routine for CALM Farm\t\t\033[0m\n");
        morningRoutine.activities();
        cropDusterOperate();
        cropDusterFly();
        cropDusterFertilize();
        cropDusterSwitchOff();
        house.store(froilan, froilanda);
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