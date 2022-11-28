package com.zipcodewilmington.froilansfarm.ShelterTests;
import com.zipcodewilmington.froilansfarm.Shelter.CropRow;
import com.zipcodewilmington.froilansfarm.Shelter.Farm;
import com.zipcodewilmington.froilansfarm.Shelter.Field;
import org.junit.Assert;
import org.junit.Test;

public class FieldTests {
    @Test
    public void fieldIsFarmTest(){
        Field field = new Field();
        Assert.assertTrue(field instanceof Farm);
    }
    @Test
    public void fieldStoreTest(){
        CropRow cropRow = new CropRow();
        Field field = new Field();
        field.store(cropRow);
        Assert.assertEquals(field.getCropRow(),cropRow);
    }
    @Test
    public void fieldGetCropRow(){
        CropRow cropRow = new CropRow();
        Field field = new Field();
        field.store(cropRow);
        Assert.assertEquals(field.getCropRow(),cropRow);
    }
}
