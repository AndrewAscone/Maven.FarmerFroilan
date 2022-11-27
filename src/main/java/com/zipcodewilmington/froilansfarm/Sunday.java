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
    }
    public void prompt(){
        StringBuilder sb = new StringBuilder();
        sb.append("\033[0;107m\033[1;95m\t\tSunday Routine for CALM Farm\t\t\033[0m\n")
                .append(farmersPlant(this.cornStalk, this.tomatoPlant, this.eggPlantSeed, this.lettuceSeed, this.carrotSeed))
                .append("\n\n\033[0;107m\033[1;95m\t\tEnd of Sunday\t\t\033[0m\n");
        System.out.println(sb);
    }
    public String farmersPlant(CornStalk cornStalk, TomatoPlant tomatoPlant, EggPlantSeed eggPlantSeed, LettuceSeed lettuceSeed, CarrotSeed carrotSeed) {
        StringBuilder result = new StringBuilder();
        cropRow = froilan.plant(cornStalk, tomatoPlant, eggPlantSeed, lettuceSeed, carrotSeed);
        result.append(String.format("\n\033[1;92m%s has planted:\033[0m", froilan.getName()));
        for (Integer i : cropRow.getCropMap().keySet()) {
            result.append(String.format("\033[1;92m\n>> Row %d: %s\033[0m", i, cropRow.getCropMap().get(i).getName()));
        }
        return result.toString();
    }
}