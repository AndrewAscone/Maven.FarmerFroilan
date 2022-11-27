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
    Horse horse;
    @Override
    public boolean mount(Horse horse) {
        if(this.mount) {
            System.out.println("\033[1;36mFroilanda is mounting on " + horse.getName() + ".\033[0m");
            this.horse = horse;
        }
        if(!this.mount) {
            System.out.println("\033[1;36mFroilanda is currently mounting on another horse. Please dismount first.\033[0m");
            return !this.mount;
        }
        this.mount = false;
        this.dismount = true;
        return !this.mount;
    }
    @Override
    public boolean dismount(Horse horse) {
        if(this.dismount && this.horse == horse) {
            System.out.println("\033[1;36mFroilanda has dismounted " + horse.getName() + ".\033[0m");
        } else {
            System.out.println("\033[1;36mNot the right horse to dismount from.\033[0m");
            return this.dismount;
        }
        if(!this.dismount) System.out.println("\033[1;36mFroilanda is not mounting to any horse.\033[0m");
        this.dismount = false;
        this.mount = true;
        return !this.dismount;
    }
    //REMOVED DISMOUNT AS IT SOUNDED REDUNDANT & CHANGED MOUNT FROM VOID TO BOOLEAN
}