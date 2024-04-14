package org.mybookshelf;

public class Book {
    private String title;
    private String author;
    private String genre;
    private boolean isRead;
}

/* The term "instance variables" refers to variables that are declared within a class but outside of any method. 
These variables are associated with individual instances or objects of the class, hence the name "instance variables." */

// Constructor with parameters
public Book (String title, String author, String genre, boolean isRead) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.isRead = isRead;
}