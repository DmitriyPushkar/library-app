package ru.pushkarev.library.models;

public class Book {
   private String title;
   private String author;
   private int releaseDate;

    public Book() {
    }

    public Book(String title, String author, int releaseDate) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }
}
