package org.example.day4;

import java.util.List;

public record Person(String name, int age, List<Language> languages) {
}
