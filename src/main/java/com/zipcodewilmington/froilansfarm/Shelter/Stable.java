package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
public class Stable extends Farm<Horse> {
    Horse[] horse;
    public Stable(int num) {
        horse = new Horse[num];
    }
    public Stable(Horse horse, Horse horse2) {
        this.horse = new Horse[2];
        this.horse[0] = horse;
        this.horse[1] = horse2;
    }
    public Stable(Horse horse, Horse horse2, Horse horse3) {
        this.horse = new Horse[3];
        this.horse[0] = horse;
        this.horse[1] = horse2;
        this.horse[2] = horse3;
    }
    public Stable(Horse horse, Horse horse2, Horse horse3, Horse horse4, Horse horse5) {
        this.horse = new Horse[5];
        this.horse[0] = horse;
        this.horse[1] = horse2;
        this.horse[2] = horse3;
        this.horse[3] = horse4;
        this.horse[4] = horse5;
    }
    public void store(Horse horse) {
        for (int i = 0; i < this.horse.length; i++) {
            if (this.horse[i] == null) {
                this.horse[i] = horse;
                System.out.println("\033[1;33m" + horse.getName() + " has been put back in stable.\033[0m");
                break;
            }
        }
    }
    public int getHorseLocation(Horse horse) {
        int num = -1;
        try {
            for (int i = 0; i < this.horse.length; i++) {
                if (this.horse[i] == horse) {
                    return i;
                }
            }
        }
        catch (NullPointerException e) {
            System.out.printf("[Stable space %s is empty]",num+1);
        }
        return num;
    }
    public Horse release(int stableNumber) {
        if(this.horse[stableNumber] != null) {
            Horse temp;
            temp = horse[stableNumber];
            horse[stableNumber] = null;
            System.out.println("\033[1;30m\033[47m" + temp.getName() + " has been released.\033[0m");
            return temp;
        }
        return null;
    }
    public String getHorseName(int num) {
        try {
            return this.horse[num].getName();
        }
        catch (NullPointerException e) {
            System.out.printf("[Stable space %s is empty] ",num+1);
        }
        return "";
    }
    public Horse getHorseObject(int num) {
        try {
            return this.horse[num];
        }
        catch (NullPointerException e) {
            System.out.printf("[Stable space %s is empty] ",num+1);
        }
        return null;
    }
//ADDED STABLE CONSTRUCTOR(5-6)
    //ADDED METHOD STORE() (7-8)
    //ADDED METHOD RELEASE() (10-12)
}