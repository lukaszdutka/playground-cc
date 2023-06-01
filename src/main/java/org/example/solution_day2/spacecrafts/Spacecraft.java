package org.example.solution_day2.spacecrafts;

import org.example.solution_day2.personnel.Astronaut;
import org.example.solution_day2.personnel.Engineer;

public abstract class Spacecraft {

    abstract void fly(Astronaut astronaut);

    abstract void repair(Engineer engineer);
}
