package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Shelter.CropRow;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SundayTest {
    Sunday sunday = new Sunday();
    CornStalk cornStalk = new CornStalk("Corn Stalk");
    TomatoPlant tomatoPlant = new TomatoPlant("Tomato Plant");
    EggPlantSeed eggPlantSeed = new EggPlantSeed("Egg Plant Seed");
    LettuceSeed lettuceSeed = new LettuceSeed("Lettuce Seed");
    CarrotSeed carrotSeed = new CarrotSeed("Carrot Seed");
    Farmer froilan = new Farmer("Froilan", 30);
    CropRow cropRow;

    @Test
    public void farmersPlantTest(){
        cropRow = froilan.plant(cornStalk, tomatoPlant, eggPlantSeed, lettuceSeed, carrotSeed);
        StringBuilder sb = new StringBuilder();
        String expected = sunday.farmersPlant(cornStalk, tomatoPlant, eggPlantSeed, lettuceSeed, carrotSeed);
        sb.append(String.format("\033[1;92m%s has planted:\033[0m", froilan.getName()));
        for (Integer i : cropRow.getCropMap().keySet()) {
            sb.append(String.format("\033[1;92m\n>> Row %d: %s\033[0m", i, cropRow.getCropMap().get(i).getName()));
        }
        String actual = String.valueOf(sb);
        Assert.assertEquals(expected, actual);
    }

}