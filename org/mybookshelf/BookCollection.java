package org.mybookshelf;

public class BookCollection {
    private Book[] books;
    private int numberOfBooks;
    private String collectionName;
    private String[] tags;
    private String ownerUserID;
    private long lastUpdatedTimestamp;
}

public BookCollection(String collectionName, String ownerUserID, int initialCapacity) {
    this.collectionName = collectionName;
    this.ownerUserID = ownerUserID;
    this.books = new Book[initialCapacity];
}