package com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Shelter.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.*;

public class Farmer extends Person implements Botanist, Rider<Horse>, FarmVehicle<Tractor> {
    boolean mount = true;
    boolean dismount = false;
    Horse horse;
    public Farmer(String name, int age) {
        super(name, age);
    }

    public boolean operate(Tractor tractor) {
        return false;
    }
    @Override
    public boolean mount(Horse horse) {
        if(this.mount) {
            System.out.println("\033[1;32mFroilan is mounting on " + horse.getName() + ".\033[0m");
            this.horse = horse;
        }
        if(!this.mount) {
            System.out.println("\033[1;32mFroilan is currently mounting on another horse. Please dismount first.\033[0m");
            return !this.mount;
        }
        this.mount = false;
        this.dismount = true;
        return !this.mount;
    }
    @Override
    public boolean dismount(Horse horse) {
        if(this.dismount && this.horse == horse) {
            System.out.println("\033[1;32mFroilan has dismounted " + horse.getName() + ".");
        } else {
            System.out.println("\033[1;32mNot the right horse to dismount from");
            return this.dismount;
        }
        if(!this.dismount) System.out.println("\033[1;32mFroilan is not mounting to any horse.\033[0m");
        this.dismount = false;
        this.mount = true;
        return !this.dismount;
    }

    @Override
    public CropRow plant(Crop crop1, Crop crop2, Crop crop3, Crop crop4, Crop crop5) {
        CropRow cropRow = new CropRow();
        cropRow.setCropMap(1, crop1);
        cropRow.setCropMap(2, crop2);
        cropRow.setCropMap(3, crop3);
        cropRow.setCropMap(4, crop4);
        cropRow.setCropMap(5, crop5);
        return cropRow;
    }
    //REMOVED DISMOUNT AS IT SOUNDED REDUNDANT & CHANGED MOUNT FROM VOID TO BOOLEAN
    //ADDED CONSTRUCTOR PASSING NAME & AGE TO SUPER
    //ADDED <TRACTOR> TO RIDER
    //MODIFIED PLANT (24-27)
}