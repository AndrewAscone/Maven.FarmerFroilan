package com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Controller.Edible;
import org.junit.Assert;
import org.junit.Test;

public class EdibleEggTest {
    @Test
    public void classInstance() {
        EdibleEgg edibleEgg = new EdibleEgg("egg");
        Assert.assertTrue(edibleEgg instanceof Edible);
    }
    @Test
    public void getNameTest() {
        EdibleEgg edibleEgg = new EdibleEgg("egg");
        Assert.assertEquals(edibleEgg.getName(),"egg");
    }

}