package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;

public class Saturday {
    FarmHouse house = new FarmHouse();
    Farmer froilan = (Farmer) house.getPersonObject(0);
    Pilot froilanda = (Pilot) house.getPersonObject(1);
    MorningRoutine morningRoutine = new MorningRoutine();
    public Saturday() {
    }

    public void activities() {
        System.out.println("\033[0;107m\033[1;90m\t\tSaturday Routine for CALM Farm\t\t\033[0m\n");
        morningRoutine.activities();
        System.out.println("\033[0;91mToday, Froilan & Froilanda went to the town to buy supplies for the upcoming week\033[0m");
        house.store(froilan, froilanda);
        System.out.println("\n\033[0;107m\033[1;90m\t\tEnd of Saturday\t\t\033[0m\n");
    }
}
