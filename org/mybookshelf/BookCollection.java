package org.mybookshelf;

public class BookCollection {
  private Book[] books;
  private int numberOfBooks;
  private String collectionName;
  private String[] tags;
  private String ownerUserID;
  private long lastUpdatedTimestamp;

  // Constructor with parameters
  public BookCollection(String collectionName, String ownerUserID, int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("Initial capacity cannot be negative");
    }
    this.collectionName = collectionName;
    this.ownerUserID = ownerUserID;
    this.books = new Book[initialCapacity];
    this.numberOfBooks = 0;
    this.tags = new String[0]; // Initialize this array with 0 elements
    this.lastUpdatedTimestamp = System.currentTimeMillis(); // Initialize with current timestamp
  }

  // Getters and setters for private instance variables (to be added; now added)
  public Book[] getBooks() {
    return books;
  }

  public int getNumberOfBooks() {
    return numberOfBooks;
  }

  public String getCollectionName() {
    return collectionName;
  }

  public String getTags() {
    return tags;
  }

  public String getOwnerUserID() {
    return ownerUserID;
  }

  public long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  // Setters follows
  public void setBooks(Book[] books) {
    this.books = books;
  }

  public void setNumberOfBooks(int numberOfBooks) {
    this.numberOfBooks = numberOfBooks;
  }

  public void setCollectionName(String collectionName) {
    this.collectionName = collectionName;
  }

  public void setTags(String[] tags) {
    this.tags = tags;
  }

  public void setOwnerUserID(String ownerUserID) {
    this.ownerUserID = ownerUserID;
  }

  public void setLasUpdatedTimestamp() {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
  }

  // Additional constructors and methods for managing the collection (to be added)
}
