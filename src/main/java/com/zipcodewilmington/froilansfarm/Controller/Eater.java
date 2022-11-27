package com.zipcodewilmington.froilansfarm.Controller;
public interface Eater <T extends Edible>{
    void eat(T edible);
}