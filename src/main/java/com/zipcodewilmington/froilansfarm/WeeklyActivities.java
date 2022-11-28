package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;

public class WeeklyActivities {
    public WeeklyActivities(){
        Sunday sunday = new Sunday();
        sunday.activities();
        Monday monday = new Monday();
        monday.activities();
        Tuesday tuesday = new Tuesday();
        tuesday.activities();
        Wednesday wednesday = new Wednesday();
        wednesday.activities();
        Thursday thursday = new Thursday();
        thursday.activities();
        Friday friday = new Friday();
        friday.activities();
        Saturday saturday = new Saturday();
        saturday.activities();
    }
}
