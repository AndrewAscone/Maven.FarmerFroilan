package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Person.Pilot;

public class FarmHouse extends Farm<Person> {
    Person[] person;
    public FarmHouse() {
        this.person = new Person[2];
        Farmer farmer = new Farmer("Froilan", 30);
        Pilot pilot = new Pilot("Froilanda", 28);
        person[0] = farmer;
        person[1] = pilot;
    }

    public void store(Farmer farmer, Pilot pilot) {
        person[0] = farmer;
        person[1] = pilot;
        System.out.println("\n\033[1;93m" + person[0].getName() + " has entered house.\033[0m");
        System.out.println("\033[1;93m" + person[1].getName() + " has entered house.\033[0m");

    }
    public Person leave(Person person) {
        for (int i = 0; i < this.person.length; i++) {
            if (this.person[i] == person) {
                Person temp;
                temp = this.person[i];
                this.person[i] = null;
                System.out.println("\033[1;93m" + temp.getName() + " has left the house.\033[0m");
                return temp;
            }
        }
        return null;
    }
    public Person getPersonObject(int num) {
        try {
            return this.person[num];
        } catch (NullPointerException e) {
            System.out.printf("[House room %s is empty] ", num + 1);
        }
        return null;
    }

    public int getPersonIndex(Person person) {
        for (int i = 0; i < this.person.length; i++) {
            if (this.person[i].equals(person)) {
                return i;
            }
        }
        return -1;
    }
}