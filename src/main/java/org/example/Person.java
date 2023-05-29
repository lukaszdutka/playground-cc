package org.example;

public class Person {
    private String name;
    private String gender;
    private int age;

    //public, private, protected, package-private

    public static int TEST = 13;

    public boolean isOlderThan(int ageThreshold) {
        return age >= ageThreshold;
    }

    public static Person getOlderPerson(Person person1, Person person2) {
        return person1.age > person2.age ? person1 : person2;
    }

    private String generateGreetingMessage() {
        return "hi, my name is " + name + ". I am " + age + " years old.";
    }

    public void greeting() {
        System.out.println(generateGreetingMessage());
    }


    public String getName() {
        return name;
    }
}
