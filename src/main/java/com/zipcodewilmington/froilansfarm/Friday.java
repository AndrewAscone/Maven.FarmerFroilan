package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;

public class Friday {

    FarmHouse house = new FarmHouse();
    Farmer froilan = (Farmer) house.getPersonObject(0);
    Pilot froilanda = (Pilot) house.getPersonObject(1);
    MorningRoutine morningRoutine = new MorningRoutine();

    public Friday() {
    }

    public void activities() {
        System.out.println("\033[0;107m\033[1;94m\t\tFriday Routine for CALM Farm\t\t\033[0m\n");
        morningRoutine.activities();
        System.out.println("\033[1;91mToday is \033[1;93mrest day \033[1;92mfor Froilan \033[1;94mand Froilanda\033[0m");
        house.store(froilan, froilanda);
        System.out.println("\n\033[0;107m\033[1;94m\t\tEnd of Friday\t\t\033[0m\n");
    }

}
