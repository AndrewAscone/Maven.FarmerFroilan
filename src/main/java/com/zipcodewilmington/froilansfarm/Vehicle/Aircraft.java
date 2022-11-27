package com.zipcodewilmington.froilansfarm.Vehicle;
import com.zipcodewilmington.froilansfarm.Controller.Rideable;
import com.zipcodewilmington.froilansfarm.Person.Pilot;

public interface Aircraft extends Rideable {
    public boolean fly(Pilot pilot);
    public String getname();
    //MODIFIED FLY TO BOOLEAN
}