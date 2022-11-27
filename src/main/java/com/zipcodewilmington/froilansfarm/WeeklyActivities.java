package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;

public class WeeklyActivities {
    public static void main(String[] args) {
        Sunday sunday = new Sunday();
        sunday.prompt();
        Monday monday = new Monday();
        monday.prompt();
        Tuesday tuesday = new Tuesday();
        tuesday.prompt();
    }
}
