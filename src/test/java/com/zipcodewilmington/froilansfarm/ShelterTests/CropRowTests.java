package com.zipcodewilmington.froilansfarm.ShelterTests;
import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Shelter.CropRow;
import com.zipcodewilmington.froilansfarm.Shelter.Farm;
import org.junit.Assert;
import org.junit.Test;
public class CropRowTests {
    @Test
    public void cropRowIsFieldTest(){
        CropRow cropRow = new CropRow();
        Assert.assertTrue(cropRow instanceof Farm);
    }
    @Test
    public void cropRowStoreTest(){
        CornStalk cornStalk = new CornStalk("CornStalk");
        CropRow cropRow = new CropRow();
        cropRow.setCropMap(1, cornStalk);
        Assert.assertEquals(cropRow.getCropMap().get(1).getName(),"CornStalk");
    }
}