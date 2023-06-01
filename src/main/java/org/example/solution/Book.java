package org.example.solution;

public class Book {
    private String title;
    private Author author;
    private int yearOfPublication;
    private double price; // Could use external package i.e. Joda Money here

    //alt+insert
    //cmd+n

    public Book(String title, Author author, int yearOfPublication, double price) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
    }


    public void displayBookInfo() {
        System.out.println("Book " + title +
                           " was written by " + author +
                           ", it was published in " + yearOfPublication +
                           ". The price is " + price + "."
        );
    }

    public static Book comparePrice(Book book1, Book book2) {
        return book1.price > book2.price ? book1 : book2;
    }
}
