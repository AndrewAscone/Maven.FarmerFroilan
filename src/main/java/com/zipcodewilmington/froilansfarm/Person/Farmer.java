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
        if(this.mount) System.out.println("Froilan is mounting on " + horse.getName() + ".");
        if(!this.mount) System.err.println("Froilan is currently mounting on another horse. Please dismount first");
        this.mount = false;
        this.dismount = true;
        return !this.mount;
    }
    @Override
    public boolean dismount(Horse horse) {
        if(this.dismount) System.out.println("Froilan has dismounted " + horse.getName() + ".");
        if(!this.dismount) System.err.println("Froilan is not mounting to any horse");
        this.dismount = false;
        this.mount = true;
        return !this.dismount;
    }
    //REMOVED DISMOUNT AS IT SOUNDED REDUNDANT & CHANGED MOUNT FROM VOID TO BOOLEAN
    //ADDED CONSTRUCTOR PASSING NAME & AGE TO SUPER
    //ADDED <TRACTOR> TO RIDER
    //MODIFIED PLANT (24-27)
}