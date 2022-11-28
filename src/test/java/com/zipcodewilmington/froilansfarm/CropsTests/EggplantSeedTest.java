package com.zipcodewilmington.froilansfarm.CropsTests;
import com.zipcodewilmington.froilansfarm.Crops.EggPlantSeed;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import org.junit.Assert;
import org.junit.Test;
public class EggplantSeedTest {
    @Test
    public void constructorTest(){
        EggPlantSeed test = new EggPlantSeed("test");

        String expected = "test";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isCropTest(){
        EggPlantSeed test = new EggPlantSeed("test");

        Assert.assertTrue(test instanceof Crop);
    }

    @Test
    public void isProduceTest(){
        EggPlantSeed test = new EggPlantSeed("test");

        Assert.assertTrue(test instanceof Produce);
    }

    @Test
    public void eggplantSeedYieldTest(){
        EggPlantSeed test = new EggPlantSeed("test");

        Assert.assertNull(test.yield());
    }

    @Test
    public void eggplantSeedHasBeenFertilizedTest(){
        EggPlantSeed test = new EggPlantSeed("test");

        Assert.assertFalse(test.hasBeenFertilized());
    }

    @Test
    public void eggplantSeedHasBeenHarvestedTest(){
        EggPlantSeed test = new EggPlantSeed("test");

        Assert.assertFalse(test.hasBeenHarvested());
    }
}
