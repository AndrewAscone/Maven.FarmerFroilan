package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Shelter.CropRow;

public class Sunday {
    Farmer froilan = new Farmer("Froilan", 30);
    CornStalk cornStalk = new CornStalk("Corn Stalk");
    TomatoPlant tomatoPlant = new TomatoPlant("Tomato Plant");
    EggPlantSeed eggPlantSeed = new EggPlantSeed("Egg Plant Seed");
    LettuceSeed lettuceSeed = new LettuceSeed("Lettuce Seed");
    CarrotSeed carrotSeed = new CarrotSeed("Carrot Seed");
    CropRow cropRow = new CropRow();

    public Sunday() {
        System.out.println("\033[0;107m\033[1;95m\t\tSunday Routine for CALM Farm\t\t\033[0m\n");
        farmersPlant();
        System.out.println("\033[0;107m\033[1;95m\t\tSunday Routine for CALM Farm\t\t\033[0m\n");
    }
    public void farmersPlant() {
        cropRow = froilan.plant(this.cornStalk, this.tomatoPlant, this.eggPlantSeed, this.lettuceSeed, this.carrotSeed);
        System.out.printf("\033[1;92m%s has planted:\033[0m", froilan.getName());
        for (Integer i : cropRow.getCropMap().keySet()) {
            System.out.printf("\033[1;92m\n>> Row %d: %s\033[0m", i, cropRow.getCropMap().get(i).getName());
        }
    }
}