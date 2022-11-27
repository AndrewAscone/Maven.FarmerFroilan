package com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Shelter.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.*;
import java.util.Map;
public class Farmer extends Person implements Botanist, Rider<Horse>, FarmVehicle<Tractor> {
    CornStalk cornStalk;
    TomatoPlant tomatoPlant;
    LettuceSeed lettuceSeed;
    EggPlantSeed eggPlantSeed;
    CarrotSeed carrotSeed;
    Map<Integer, Crop> sow;
    boolean mount = true;
    boolean dismount = false;
    Horse horse;
    public Farmer(String name, int age) {
        super(name, age);
    }
    public void plant() {
        CropRow cropRow = new CropRow(sow);
        cropRow.sow(cornStalk, tomatoPlant, lettuceSeed, eggPlantSeed, carrotSeed);
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
    //REMOVED DISMOUNT AS IT SOUNDED REDUNDANT & CHANGED MOUNT FROM VOID TO BOOLEAN
    //ADDED CONSTRUCTOR PASSING NAME & AGE TO SUPER
    //ADDED <TRACTOR> TO RIDER
    //MODIFIED PLANT (24-27)
}