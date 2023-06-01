package org.example.solution_day2.personnel;

public class Astronaut extends Personnel {

    public void pilotSpacecraft() {
        System.out.println("I am a piloting!");
    }

    @Override
    public void reportStatus() {
        System.out.println("Astronaut reporting status!");
    }
}
