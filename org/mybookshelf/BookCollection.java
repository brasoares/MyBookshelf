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

  // Additional constructors and methods for managing the collection (to be added)
}
