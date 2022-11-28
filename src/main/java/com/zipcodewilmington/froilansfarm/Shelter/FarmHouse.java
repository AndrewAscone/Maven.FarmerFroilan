package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Person.Person;
public class FarmHouse extends Farm<Person>{
    Person person;
    public FarmHouse() {
    }
    public void store(Person person) {
        this.person = person;
    }
    public Person release() {
        return this.person;
    }
    //ADDED FARMHOUSE CONSTRUCTOR (5-6)
    //ADDED METHOD STORE() (7-9)
    //ADDED METHOD RELEASE() (10-12)
}