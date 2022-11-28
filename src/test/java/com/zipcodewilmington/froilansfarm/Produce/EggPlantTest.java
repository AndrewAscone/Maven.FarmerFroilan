package com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Controller.Edible;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import org.junit.Assert;
import org.junit.Test;

public class EggPlantTest {

    @Test
    public void classInstance() {
        EggPlant eggPlant = new EggPlant("eggplant");
        Assert.assertTrue(eggPlant instanceof Vegetable);
    }
    @Test
    public void classInstance2() {
        EggPlant eggPlant = new EggPlant("eggplant");
        Assert.assertTrue(eggPlant instanceof Edible);
    }
    @Test
    public void getNameTest() {
        EggPlant eggPlant = new EggPlant("eggplant");
        Assert.assertEquals(eggPlant.getName(),"eggplant");
    }
}