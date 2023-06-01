package org.example.solution;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Łukasz", 1997);
        Book book = new Book("SOLIDne programowanie", author, 1997, 21.99);

        System.out.println(author.getInfoAbout());
        book.displayBookInfo();
        Book result = Book.comparePrice(book, book);

        //Create a method within the Book class that takes an Author
        // record as a parameter and returns a String about the author's
        // name and their first publication year.
    }
}
