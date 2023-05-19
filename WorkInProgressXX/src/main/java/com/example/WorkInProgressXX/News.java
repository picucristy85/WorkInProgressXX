package com.example.WorkInProgressXX;

import jakarta.persistence.*;

@Entity
@Table(name = "news")
public class News {
  @Id
  @SequenceGenerator(name = "news_sequence", allocationSize = 1)
  @GeneratedValue(generator = "news_sequence", strategy = GenerationType.SEQUENCE)
  private String title;

  private String link;
  private String description;
  private String publicationDate;

  public News(
          String title,
          String link,
          String description,
          String publicationDate) {
    this.title = title;
    this.link = link;
    this.description = description;
    this.publicationDate = publicationDate;
  }

  // Add getters and setters

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getlink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getpublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }

  public static <U extends Comparable<? super U>, T> U getPublicationDate(T t) {
    return null;
  }
}
