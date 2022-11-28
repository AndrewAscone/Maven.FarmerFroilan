package com.zipcodewilmington.froilansfarm.Vehicle;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    @Test
    public void classInstanceOfTest() {
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Vehicle);
    }

    @Test
    public void classInstanceOfTest2() {
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Aircraft);
    }

    @Test
    public void makeNoiseTest() {
        CropDuster cropDuster = new CropDuster();
        Assert.assertEquals(cropDuster.makeNoise(), "Brrr");
    }

    @Test
    public void flyTest() {
        Pilot froilanda = new Pilot("Froilanda", 28);
        CropDuster cropDuster = new CropDuster("Crop Duster");
        Assert.assertFalse(cropDuster.fly(froilanda));
    }
    @Test
    public void flyTest2() {
        Pilot froilanda = new Pilot("Froilanda", 28);
        CropDuster cropDuster = new CropDuster("Crop Duster");
        froilanda.operate(cropDuster);
        Assert.assertTrue(cropDuster.fly(froilanda));
    }
    @Test
    public void fertilizeTest() {
        Pilot froilanda = new Pilot("Froilanda", 28);
        CropDuster cropDuster = new CropDuster("Crop Duster");
        Assert.assertFalse(cropDuster.fertilize());
    }
    @Test
    public void fertilizeTest2() {
        Pilot froilanda = new Pilot("Froilanda", 28);
        CropDuster cropDuster = new CropDuster("Crop Duster");
        froilanda.operate(cropDuster);
        Assert.assertFalse(cropDuster.fertilize());
    }
    @Test
    public void fertilizeTest3() {
        Pilot froilanda = new Pilot("Froilanda", 28);
        CropDuster cropDuster = new CropDuster("Crop Duster");
        froilanda.operate(cropDuster);
        cropDuster.fly(froilanda);
        Assert.assertTrue(cropDuster.fertilize());
    }
    @Test
    public void getNameTest() {
        CropDuster cropDuster = new CropDuster("Crop Duster");
        Assert.assertEquals(cropDuster.getname(),"Crop Duster");
    }
    @Test
    public void getFlyResultTest() {
        Pilot froilanda = new Pilot("Froilanda", 28);
        CropDuster cropDuster = new CropDuster("Crop Duster");
        Assert.assertFalse(cropDuster.getFlyResult());
    }
    @Test
    public void getFlyResultTest2() {
        Pilot froilanda = new Pilot("Froilanda", 28);
        CropDuster cropDuster = new CropDuster("Crop Duster");
        froilanda.operate(cropDuster);
        Assert.assertFalse(cropDuster.getFlyResult());
    }
    @Test
    public void getFlyResultTest3() {
        Pilot froilanda = new Pilot("Froilanda", 28);
        CropDuster cropDuster = new CropDuster("Crop Duster");
        froilanda.operate(cropDuster);
        cropDuster.fly(froilanda);
        Assert.assertTrue(cropDuster.getFlyResult());
    }
    @Test
    public void getFertilizeResultTest() {
        Pilot froilanda = new Pilot("Froilanda", 28);
        CropDuster cropDuster = new CropDuster("Crop Duster");
        Assert.assertFalse(cropDuster.getFertilizeResult());
    }
    @Test
    public void getFertilizeResultTest2() {
        Pilot froilanda = new Pilot("Froilanda", 28);
        CropDuster cropDuster = new CropDuster("Crop Duster");
        froilanda.operate(cropDuster);
        Assert.assertFalse(cropDuster.getFertilizeResult());
    }
    @Test
    public void getFertilizeResultTest3() {
        Pilot froilanda = new Pilot("Froilanda", 28);
        CropDuster cropDuster = new CropDuster("Crop Duster");
        froilanda.operate(cropDuster);
        cropDuster.fly(froilanda);
        Assert.assertFalse(cropDuster.getFertilizeResult());
    }
    @Test
    public void getFertilizeResultTest4() {
        Pilot froilanda = new Pilot("Froilanda", 28);
        CropDuster cropDuster = new CropDuster("Crop Duster");
        froilanda.operate(cropDuster);
        cropDuster.fly(froilanda);
        cropDuster.fertilize();
        Assert.assertTrue(cropDuster.getFertilizeResult());
    }
}