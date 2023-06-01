package org.example.solution;

public record Author(String name, int yearOfFirstPublication) {
    public String getInfoAbout() {
        return "Author " + name + " published his/her first book at " + yearOfFirstPublication;
    }

}
