package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
public class Stable extends Farm<Horse> {
    Horse[] horse = new Horse[3];
    public Stable() {
        horse[0] = new Horse("Rosie");
        horse[1] = new Horse("Charlie");
        horse[2] = new Horse("Bella");
    }
    public void store(Horse horse) {
        for(int i = 0; i < this.horse.length; i++) {
            if(this.horse[i] == null) {
                this.horse[i] = horse;
            }
        }
    }
    public Horse release(int stableNumber) {
        return this.horse[stableNumber];
    }
    //ADDED STABLE CONSTRUCTOR(5-6)
    //ADDED METHOD STORE() (7-8)
    //ADDED METHOD RELEASE() (10-12)
}