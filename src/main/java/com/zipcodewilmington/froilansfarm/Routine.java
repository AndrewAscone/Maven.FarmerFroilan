package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Controller.Edible;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import com.zipcodewilmington.froilansfarm.Person.*;
import com.zipcodewilmington.froilansfarm.Produce.*;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;
public class Routine {
    Horse rosie;
    Horse charlie;
    Horse bella;
    EarCorn earCorn = new EarCorn("earcorn");
    Tomato tomato = new Tomato("tomato");
    EggPlant eggPlant = new EggPlant("eggplant");
    Lettuce lettuce = new Lettuce("lettuce");
    Carrot carrot = new Carrot("carrot");
    EdibleEgg egg = new EdibleEgg("egg");
    Farmer froilan = new Farmer("Froilan", 30);
    Pilot froilanda = new Pilot("Froilanda", 28);
    Stable stable = new Stable();
    Edible[] froilanBreakfast;
    Edible[] froilandaBreakfast;
    String prompt;
    int horseReleased;
    public Routine() {
        horseRelease(1);
        horseRelease(2);
        horseRelease(3);
        froilan.mount(rosie);
        froilanda.mount(charlie);
        froilan.dismount(rosie);
        froilan.mount(bella);
        froilanda.dismount(charlie);
        horseFeeding(rosie, earCorn, lettuce, eggPlant);
        System.out.println(this.prompt);
        froilan.dismount(bella);
        horseFeeding(charlie, carrot, lettuce, earCorn);
        horseFeeding(bella, carrot, eggPlant, lettuce);
        froilanBreakfast();
        froilandaBreakfast();
    }
    public void horseRelease(int num) {
        switch (num) {
            case 1:
                rosie = new Horse(stable.release(0).getName());
                break;
            case 2:
                charlie = new Horse(stable.release(1).getName());
                break;
            case 3:
                bella = new Horse(stable.release(2).getName());
                break;
        }
    }
    public String horseFeeding(Horse horse, Vegetable vegetable1, Vegetable vegetable2, Vegetable vegetable3) {
        return this.prompt = String.format("\n%s has been fed with %s, %s, & %s", horse.getName(), vegetable1.getName(), vegetable2.getName(), vegetable3.getName());
    }
    public Edible[] froilanBreakfast() {
        this.froilanBreakfast = new Edible[8];
        for(int i = 0; i < 5; i++) {
            froilanBreakfast[i] = froilan.eat(egg);
        }
        froilanBreakfast[5] = froilan.eat(tomato);
        froilanBreakfast[6] = froilan.eat(tomato);
        froilanBreakfast[7] = froilan.eat(earCorn);
        return froilanBreakfast;
    }
    public Edible[] froilandaBreakfast() {
        this.froilandaBreakfast = new Edible[5];
        froilandaBreakfast[0] = froilanda.eat(earCorn);
        froilandaBreakfast[1] = froilanda.eat(earCorn);
        froilandaBreakfast[2] = froilanda.eat(tomato);
        froilandaBreakfast[3] = froilanda.eat(egg);
        froilandaBreakfast[4] = froilanda.eat(egg);
        return froilandaBreakfast;
    }

//    Every morning, Froilan and Froilanda begin their morning by
//
//    Riding each Horse in each Stable.
//    Feeding each Horse 3 ear of Corn.
//            For breakfast,
//    Froilan eats 1 EarCorn, 2 Tomato, and 5 Egg.
//    Froilanda eats 2 EarCorn, 1 Tomato, and 2 Egg.
//            Sunday, Froilan plants 3 different type of Crop in his first, second, and third CropRow.
//
//    On Monday, his sister, Froilanda uses the CropDuster to fly over the Field and fertilize each of the CropRow
//
//    On Tuesday, Froilan uses his Tractor to harvest each Crop in each CropRow.
}
