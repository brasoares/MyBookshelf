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
      throw new IllegalArgumentException()
    }
    this.collectionName = collectionName;
    this.ownerUserID = ownerUserID;
    this.books = new Book[initialCapacity];
    this.numberOfBooks = 0;
    this.tags = new String[0]; // Initialize this array with 0 elements
    this.lastUpdatedTimestamp = System.currentTimeMillis(); // Initialize with current timestamp
  }
}