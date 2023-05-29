package org.example;

public class Main2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Azor", "1");
        Dog dog2 = new Dog("Azor", "1");

        //porównywanie _wartości_ obiektów
        System.out.println(dog.equals(dog2)); // true

        // porównywanie referencji obiektów
        System.out.println(dog == dog2); // false


//        System.out.println(dog.hashCode());
//        System.out.println(dog2.hashCode());

        // pytania na rozmowy kwalifikacyjne:
        // kontrakt equals i hashCode
        // jak działa hashmapa
    }
}
