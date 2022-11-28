package com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Controller.Edible;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import org.junit.Assert;
import org.junit.Test;
public class TomatoTest {

    @Test
    public void classInstance() {
        Tomato tomato = new Tomato("eggplant");
        Assert.assertTrue(tomato instanceof Vegetable);
    }
    @Test
    public void classInstance2() {
        Tomato tomato = new Tomato("eggplant");
        Assert.assertTrue(tomato instanceof Edible);
    }
    @Test
    public void getNameTest() {
        Tomato tomato = new Tomato("tomato");
        Assert.assertEquals(tomato.getName(),"tomato");
    }

}