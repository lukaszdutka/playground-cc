package org.example.solution_day2.personnel;

public class Engineer extends Personnel {

    public void repairSpacecraft() {
        System.out.println("Engineer repairing!");
    }

    @Override
    public void reportStatus() {
        System.out.println("Engineer reporting status!");
    }
}
