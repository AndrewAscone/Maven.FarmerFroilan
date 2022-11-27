package com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Vehicle.*;
public class Pilot extends Person implements Rider<Horse>, FarmVehicle<CropDuster> {
    boolean mount = true;
    boolean dismount = false;
    boolean operate = true;
    boolean switchOff = false;
    Horse horse;
    public Pilot() {
    }
    public Pilot(String name, int age) {
        super(name, age);
    }
    public boolean operate(CropDuster cropDuster) {
        if(this.operate) System.out.println("\033[1;36mFroilanda is operating " + cropDuster.getname() + ".\033[0m");
        if(!this.operate) System.out.println("\033[1;36mFroilanda is currently operating " + cropDuster.getname() + ".\033[0m");
        this.switchOff = true;
        return this.operate = false;
    }
    public boolean getOperate() {
        return this.operate;
    }
    @Override
    public boolean switchOff(CropDuster cropDuster) {
        if(this.switchOff) System.out.println("\033[1;36mFroilanda has landed & turned off " + cropDuster.getname() + ".\033[0m");
        if(!this.switchOff) System.out.println("\033[1;36mFroilanda is not operating any vehicle.\033[0m");
        this.operate = true;
        return !this.switchOff;
    }
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