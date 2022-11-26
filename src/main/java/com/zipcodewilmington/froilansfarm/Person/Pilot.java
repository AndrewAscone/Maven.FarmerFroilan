package com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Vehicle.*;
public class Pilot extends Person implements Rider<Horse>, FarmVehicle<CropDuster> {
    boolean mount = true;
    boolean dismount = false;
    public Pilot(String name, int age) {
        super(name, age);
    }
    public boolean mount() {
        return false;
    }
    public boolean operate(CropDuster cropDuster) {
        return false;
    }
    @Override
    public boolean mount(Horse horse) {
        if(this.mount) System.out.println("Froilanda is mounting on " + horse.getName() + ".");
        if(!this.mount) System.err.println("Froilanda is currently mounting on another horse .Please dismount first");
        this.mount = false;
        this.dismount = true;
        return !this.mount;
    }
    @Override
    public boolean dismount(Horse horse) {
        if(this.dismount) System.out.println("Froilanda has dismounted " + horse.getName() + ".");
        if(!this.dismount) System.err.println("Froilanda is not mounting to any horse");
        this.dismount = false;
        this.mount = true;
        return !this.dismount;
    }
    //REMOVED DISMOUNT AS IT SOUNDED REDUNDANT & CHANGED MOUNT FROM VOID TO BOOLEAN
}