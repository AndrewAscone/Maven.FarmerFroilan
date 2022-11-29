package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;
import org.junit.Assert;
import org.junit.Test;

public class WednesdayTest {

    Chicken chicken = new Chicken();
    FarmHouse house = new FarmHouse();

    Wednesday wednesday = new Wednesday();

    Farmer froilan = (Farmer) house.getPersonObject(0);

    Pilot froilanda = (Pilot) house.getPersonObject(1);

    @Test
    public void totalEggsYieldTest(){
        int min = 0;
        int max = 77;

        Assert.assertTrue( wednesday.totalEggsYield()>= 0 && wednesday.totalEggsYield() <= 77);
    }
}
