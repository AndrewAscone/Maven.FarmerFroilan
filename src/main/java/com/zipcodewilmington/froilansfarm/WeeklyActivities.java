package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;

public class WeeklyActivities {
    public WeeklyActivities(){
        MorningRoutine routine = new MorningRoutine();
        routine.activities();
        Sunday sunday = new Sunday();
        sunday.activities();
        Monday monday = new Monday();
        monday.activities();
        Tuesday tuesday = new Tuesday();
        tuesday.activities();
        Wednesday wednesday = new Wednesday();
        wednesday.activities();
    }
}
