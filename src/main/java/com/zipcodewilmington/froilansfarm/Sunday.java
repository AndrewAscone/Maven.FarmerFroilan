package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Shelter.CropRow;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;

public class Sunday {
    CornStalk cornStalk = new CornStalk("Corn Stalk");
    TomatoPlant tomatoPlant = new TomatoPlant("Tomato Plant");
    EggPlantSeed eggPlantSeed = new EggPlantSeed("Egg Plant Seed");
    LettuceSeed lettuceSeed = new LettuceSeed("Lettuce Seed");
    CarrotSeed carrotSeed = new CarrotSeed("Carrot Seed");
    CropRow cropRow = new CropRow();
    FarmHouse house = new FarmHouse();
    Farmer froilan = (Farmer) house.getPersonObject(0);
    Pilot froilanda = (Pilot) house.getPersonObject(1);
    MorningRoutine morningRoutine = new MorningRoutine();

    public Sunday() {
    }
    public void activities(){
        System.out.printf("\033[0;107m\033[1;95m\t\tSunday Routine for CALM Farm\t\t\033[0m\n\n");
        morningRoutine.activities();
        System.out.printf(farmersPlant(this.cornStalk, this.tomatoPlant, this.eggPlantSeed, this.lettuceSeed, this.carrotSeed));
        house.store(froilan, froilanda);
        System.out.printf("\n\n\033[0;107m\033[1;95m\t\tEnd of Sunday\t\t\033[0m\n\n");
    }
    public String farmersPlant(CornStalk cornStalk, TomatoPlant tomatoPlant, EggPlantSeed eggPlantSeed, LettuceSeed lettuceSeed, CarrotSeed carrotSeed) {
        StringBuilder result = new StringBuilder();
        cropRow = froilan.plant(cornStalk, tomatoPlant, eggPlantSeed, lettuceSeed, carrotSeed);
        result.append(String.format("\033[1;92m%s has planted:\033[0m", froilan.getName()));
        for (Integer i : cropRow.getCropMap().keySet()) {
            result.append(String.format("\033[1;92m\n>> Row %d: %s\033[0m", i, cropRow.getCropMap().get(i).getName()));
        }
        return result.toString();
    }
}