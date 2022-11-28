package com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Controller.Edible;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import org.junit.Assert;
import org.junit.Test;

public class EarCornTest {

    @Test
    public void classInstance() {
        EarCorn earCorn = new EarCorn("Earcorn");
        Assert.assertTrue(earCorn instanceof Vegetable);
    }
    @Test
    public void classInstance2() {
        EarCorn earCorn = new EarCorn("Earcorn");
        Assert.assertTrue(earCorn instanceof Edible);
    }
    @Test
    public void getNameTest() {
        EarCorn earCorn = new EarCorn("Earcorn");
        Assert.assertEquals(earCorn.getName(),"Earcorn");
    }

}