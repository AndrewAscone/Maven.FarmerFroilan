package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;

public class Wednesday {
    Chicken chicken = new Chicken();
    FarmHouse house = new FarmHouse();
    Farmer froilan = (Farmer) house.getPersonObject(0);
    Pilot froilanda = (Pilot) house.getPersonObject(1);
    MorningRoutine morningRoutine = new MorningRoutine();
    public Wednesday() {
    }
    public void activities() {
        System.out.println("\033[0;107m\033[1;92m\t\tWednesday Routine for CALM Farm\t\t\033[0m\n");
        morningRoutine.activities();
        System.out.printf("\033[1;36m%s has collected %s edible eggs for the week\n\033[0m", froilanda.getName(),totalEggsYield());
        house.store(froilan, froilanda);
        System.out.println("\n\033[0;107m\033[1;92m\t\tEnd of Wednesday\t\t\033[0m\n");
    }
    public int totalEggsYield() {
        int counter = 77;
        for(int i = 0; i < 78; i++) {
            try {
                if(chicken.yield().equals(null)) {
                }
            }
            catch (NullPointerException e) {
                counter--;
            }
        }
        return counter;
    }
}
