package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Produce.Carrot;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

public class MorningRoutineTest {
    Horse horse = new Horse("Charlie");
    Carrot earCorn = new Carrot("EarCorn");
    EdibleEgg egg = new EdibleEgg("Egg");
    Tomato tomato = new Tomato("Tomato");
    MorningRoutine test = new MorningRoutine();
    Farmer froilan = new Farmer("Froilan", 30);
    Pilot froilanda = new Pilot("Froilandas", 28);
    Chicken kentucky, popeyes, link, torchic, foghorn, eggmaker, wanda, yolkahontas, zelda, chickadee, whatever, barbie, kardashian, henzilla, cruella;
    ChickenCoop coopACabana = new ChickenCoop("Coop-A-Cabana", kentucky = new Chicken(), torchic = new Chicken());
    ChickenCoop tajMaCoop = new ChickenCoop("Taj Ma Coop",popeyes = new Chicken(), eggmaker = new Chicken(), wanda = new Chicken());
    ChickenCoop eggCademy = new ChickenCoop("Egg-Cademy",link = new Chicken(), yolkahontas = new Chicken(), chickadee = new Chicken(), whatever = new Chicken());
    ChickenCoop justGotLaid = new ChickenCoop("Just-Got-Laid",foghorn = new Chicken(), zelda = new Chicken(), barbie = new Chicken(), kardashian = new Chicken(), henzilla = new Chicken(), cruella = new Chicken());
    @Test
    public void horseFeedingTest() {
        String expected = test.horseFeeding(horse, earCorn, earCorn, earCorn);
        String actual = String.format("\033[1;94m%s has been fed with %s, %s, & %s", horse.getName(), earCorn.getName(), earCorn.getName(), earCorn.getName() + ".\n\033[0m");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void froilanBreakfastTest() {
        String expected = test.froilanBreakfast(froilan, egg, tomato, earCorn);
        String actual = String.format("\033[1;32m%s has eaten 5 %s, 2 %s, & 1 %s\n\033[0m", froilan.getName(), egg.getName(), tomato.getName(), earCorn.getName());
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void froilandaBreakfastTest() {
        String expected = test.froilandaBreakfast(froilanda, earCorn, tomato, egg);
        String actual = String.format("\033[1;36m%s has eaten 2 %s, 1 %s, & 2 %s\n\033[0m", froilanda.getName(), egg.getName(), tomato.getName(), earCorn.getName());
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void chickenfeedingTest() {
        String expected = test.chickenFeeding(earCorn);
        String actual = String.format(
                """
                        \033[1;91mAll of the chickens at %s has been fed\033[0m
                        \033[1;93mAll of the chickens at %s has been fed\033[0m
                        \033[1;92mAll of the chickens at %s has been fed\033[0m
                        \033[1;94mAll of the chickens at %s has been fed\033[0m
                        """,coopACabana.getName(),tajMaCoop.getName(),eggCademy.getName(),justGotLaid.getName());
        Assert.assertEquals(expected,actual);
    }
}