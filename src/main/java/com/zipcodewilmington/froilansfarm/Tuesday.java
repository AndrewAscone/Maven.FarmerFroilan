package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class Tuesday {
    Farmer froilan = new Farmer("Froilan",30);
    Tractor tractor = new Tractor("Tractor");
    public Tuesday(){
    }
    public void prompt(){
        System.out.println("\033[0;107m\033[1;93m\t\tTuesday Routine for CALM Farm\t\t\033[0m\n");
        froilan.operate(tractor);
        tractor.harvest(froilan);
        froilan.switchOff(tractor);
        System.out.println("\n\033[0;107m\033[1;93m\t\tEnd of Tuesday\t\t\033[0m\n");
    }
}
