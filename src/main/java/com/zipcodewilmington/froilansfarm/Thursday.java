package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Cow;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Shelter.CowShed;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;

public class Thursday {
    FarmHouse house = new FarmHouse();
    Farmer froilan = (Farmer) house.getPersonObject(0);
    Pilot froilanda = (Pilot) house.getPersonObject(1);
    MorningRoutine morningRoutine = new MorningRoutine();
    Cow betty = new Cow("Betty");
    Cow buttercup = new Cow ("Buttercup");
    Cow maggie = new Cow ("Maggie");
    Cow sweetie = new Cow ("Sweetie");
    Cow emma = new Cow ("Emma");
    Cow molly = new Cow ("Molly");
    Cow beef = new Cow ("Beef");
    Cow penelope = new Cow ("Penelope");
    Cow meg = new Cow ("Meg");
    Cow bessie = new Cow ("Bessie");
    CowShed cowShed1 = new CowShed(betty, bessie);
    CowShed cowShed2 = new CowShed(buttercup, maggie, sweetie);
    CowShed cowShed3 = new CowShed(beef, emma, molly, penelope, meg);
    public Thursday() {
    }

    public void activities() {
        System.out.println("\033[0;107m\033[1;96m\t\tThursday Routine for CALM Farm\t\t\033[0m\n");
        morningRoutine.activities();
        froilan.milk(betty);
        froilanda.milk(bessie);
        froilan.milk(buttercup);
        froilanda.milk(maggie);
        froilan.milk(sweetie);
        froilanda.milk(beef);
        froilan.milk(emma);
        froilanda.milk(molly);
        froilan.milk(penelope);
        froilanda.milk(meg);
        house.store(froilan,froilanda);
        System.out.println("\n\033[0;107m\033[1;96m\t\tEnd of Thursday\t\t\033[0m\n");
    }

}