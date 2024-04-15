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
public Book(String title, String author, String genre, boolean isRead) {
  this.title = title;
  this.author = author;
  this.genre = genre;
  this.isRead = isRead;
}

// Default constructor
public Book() {
  // Default values
  this.title = " ";
  this.author = " ";
  this.genre = " ";
  this.isRead = false;
}

// Getters and Setters for title
public String getTitle() {
  return title;
}

public void setTitle(String title) {
  this.title = title;
}

// Getters and Setters for author
public String getAuthor() {
  return author;
}

public void setAuthor(String author) {
  this.author = author;
}

// Getters and Setters for genre
public String getGenre() {
  return genre;
}

public void setGenre(String genre) {
  this.genre = genre;
}

// Getters and Setters for isRead
public boolean isRead() {
  return isRead;
}

public void setRead(boolean isRead) {
  this.isRead = isRead;
}