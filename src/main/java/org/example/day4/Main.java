package org.example.day4;

import java.util.List;
import java.util.stream.Collectors;

import static org.example.day4.Language.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Łukasz", 25, List.of(Polish, English)),
                new Person("Karol", 52, List.of(Polish, English, German)),
                new Person("Karolina", 28, List.of(English)),
                new Person("Marta", 52, List.of(Spanish, English)),
                new Person("Paweł", 56, List.of(Polish))
        );

        // Za pomocą streamów:

        //1. zsumowac wiek wszystkich osób.
        System.out.println(
                people.stream().mapToInt(Person::age).sum()
        );

        //2. Stworzyc mapę imie -> liczba języków, które dana osoba umie.
        System.out.println(
                people.stream().collect(
                        Collectors.toMap(
                                Person::name,
                                r -> r.languages().size()))
        );

        //3. policzyc, ile _różnych_ języków występuje.
        System.out.println(
                people.stream()
                        .flatMap(p -> p.languages().stream())
                        .distinct()
                        .count()
        );

        //4. Policzyc, ile razy występuje każdy język (mapa język->liczba).
        System.out.println(
                people.stream()
                        .flatMap(p -> p.languages().stream())
                        .collect(Collectors.toSet())
        );

        //5. Zwrócic osobę, która ma najlepszy indeks "liczba języków podzielic przez wiek"
        //  note: im więcej języków i im młodsza osoba tym lepiej
        System.out.println(
                people.stream().reduce(
                        people.get(0),
                        (acc, curr) -> languageAgeIndex(acc) > languageAgeIndex(curr) ? acc : curr
                )
        );

        //6. Pogrupowac ludzi na dwie grupy: "mlodsi" (39 i mniej) oraz "starsi" (40 i więcej)
        System.out.println(
                people.stream().collect(Collectors.groupingBy(
                        p -> p.age() < 40 ? "mlodsi" : "starsi",
                        Collectors.toList()
                ))
        );
    }

    private static double languageAgeIndex(Person acc) {
        return 1.0 * acc.languages().size() / acc.age();
    }
}
