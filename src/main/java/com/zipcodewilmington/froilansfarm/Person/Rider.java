package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Controller.Rideable;

public interface Rider <T extends Rideable>{

    public void mount();

    public void dismount();
}
