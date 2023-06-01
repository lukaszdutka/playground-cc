package org.example.solution_day2.spacecrafts;

import org.example.solution_day2.personnel.Astronaut;
import org.example.solution_day2.personnel.Engineer;

public class SolarSystemSpacecraft extends Spacecraft {
    @Override
    void fly(Astronaut astronaut) {
        System.out.println("Spacecraft is flying.");
        astronaut.pilotSpacecraft();
    }

    @Override
    void repair(Engineer engineer) {
        System.out.println("Repairing Solar System Spacecraft.");
        engineer.repairSpacecraft();
    }
}
