package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Person.Pilot;

public class Wednesday {
    Chicken chicken = new Chicken();
    Pilot froilanda = new Pilot("Froilanda", 28);
    public Wednesday() {
        activities();
    }
    public void activities() {
        System.out.println("\033[0;107m\033[1;92m\t\tWednesday Routine for CALM Farm\t\t\033[0m\n");
        System.out.printf("\033[1;36m%s has collected %s edible eggs the week\n\033[0m", froilanda.getName(),totalEggsYield());
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
