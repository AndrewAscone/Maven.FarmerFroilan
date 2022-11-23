package com.zipcodewilmington.froilansfarm.Controller;

public interface Eater <T extends Edible>{

    public void eat(T edible);
}
