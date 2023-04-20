package com.trybe.spring.domain;

import java.util.UUID;

/**
 * Class Book.
 */
public class Book {
  private UUID id;

  private String name;

  private String author;

  public Book() {
    this.id = UUID.randomUUID();
  }

  /**
   * Constructor.
   */
  public Book(String name, String author) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.author = author;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Book)) {
      return false;
    }
    Book book = (Book) obj;
    return this.id.equals(book.id);
  }

}

