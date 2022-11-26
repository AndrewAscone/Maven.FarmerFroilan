package com.zipcodewilmington.froilansfarm.Controller;
public interface Eater <T extends Edible>{
    public Edible eat(T edible);
}