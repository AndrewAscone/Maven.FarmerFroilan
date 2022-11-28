package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Animal.Cow;

public class CowShed extends Farm<Cow>{

    Cow[] cow;
    public CowShed(int num) {
        cow = new Cow[num];
    }
    public CowShed(Cow cow, Cow cow2) {
        this.cow = new Cow[2];
        this.cow[0] = cow;
        this.cow[1] = cow2;
    }
    public CowShed(Cow cow, Cow cow2, Cow cow3) {
        this.cow = new Cow[3];
        this.cow[0] = cow;
        this.cow[1] = cow2;
        this.cow[2] = cow3;
    }
    public CowShed(Cow cow, Cow cow2, Cow cow3, Cow cow4, Cow cow5) {
        this.cow = new Cow[5];
        this.cow[0] = cow;
        this.cow[1] = cow2;
        this.cow[2] = cow3;
        this.cow[3] = cow4;
        this.cow[4] = cow5;
    }
    public void store(Cow cow) {
        for (int i = 0; i < this.cow.length; i++) {
            if (this.cow[i] == null) {
                this.cow[i] = cow;
                System.out.println("\033[1;97m" + cow.getName() + " has been put back in cowShed.\033[0m");
                break;
            }
        }
    }
    public int getCowLocation(Cow cow) {
        int num = -1;
        try {
            for (int i = 0; i < this.cow.length; i++) {
                if (this.cow[i] == cow) {
                    return i;
                }
            }
        }
        catch (NullPointerException e) {
            System.out.printf("[CowShed space %s is empty]",num+1);
        }
        return num;
    }
    public Cow release(int shedNumber) {
        if(this.cow[shedNumber] != null) {
            Cow temp;
            temp = cow[shedNumber];
            cow[shedNumber] = null;
            System.out.println("\033[1;97m" + temp.getName() + " has been released.\033[0m");
            return temp;
        }
        return null;
    }
    public String getCowName(int num) {
        try {
            return this.cow[num].getName();
        }
        catch (NullPointerException e) {
            System.out.printf("[CowShed space %s is empty] ",num+1);
        }
        return "";
    }
    public Cow getCowObject(int num) {
        try {
            return this.cow[num];
        }
        catch (NullPointerException e) {
            System.out.printf("[CowShed space %s is empty] ",num+1);
        }
        return null;
    }

    public int getCowShedSize() {
        return cow.length;
    }
//ADDED STABLE CONSTRUCTOR(5-6)
    //ADDED METHOD STORE() (7-8)
    //ADDED METHOD RELEASE() (10-12)
}