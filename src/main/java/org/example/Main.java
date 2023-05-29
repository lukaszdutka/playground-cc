package org.example;


import static org.example.Person.*;

public class Main {
    public static void main(String[] args) {
        //klasy, rekordy, stany i zachowania, konstruktory, metody instancyjne i statyczne

        //metody instancyjne
        // wywolywane na "obiekcie/instancji"
        // instancja - instancja jakiejś klasy, obiekt jakiejś klasy
        //metody statyczne
        // wywolywane na "klasie" nie trzeba wywoływac na obiekcie

        Person p = new Person();
        p.greeting();

        // alt enter / options enter

        Person olderPerson = Person.getOlderPerson(p, p);
        System.out.println(TEST);

        p.isOlderThan(18);
    }
}
