package org.example;

import java.util.Objects;

public final class Dog {
    private final String name;
    private final String race;

    public Dog(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public Dog changeName(String newName) {
        return new Dog(newName, race);
    }

    public String name() {
        return name;
    }

    public String race() {
        return race;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Dog) obj;
        return Objects.equals(this.name, that.name) &&
               Objects.equals(this.race, that.race);
    }

    @Override
    public int hashCode() {
        // równe hashCode to warunek *konieczny* do równości obiektów,
        // ale nie *wystarczający*
        return Objects.hash(name, race);
    }

    @Override
    public String toString() {
        return "Dog[" +
               "name=" + name + ", " +
               "race=" + race + ']';
    }

}