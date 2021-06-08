package com.launchacademy.library.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="books")
@NoArgsConstructor
@Getter
@Setter
public class Book {
  @Id
  @SequenceGenerator(name="book_generator", sequenceName = "books_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="book_generator")
  @Column(name="id", nullable = false, unique = true)
  private Integer id;

  @NotNull(message="can't be blank")
  @Length(max=200)
  @Column(name="title", nullable=false)
  private String title;

  @Length(max=200)
  @NotNull(message="can't be blank")
  @Column(name="author", nullable=false)
  private String author;


  @Length(max=50)
  @NotNull(message="can't be blank")
  @Column(name="genre", nullable=false)
  private String genre;

  @Range(min=1)
  @NotNull(message="can't be blank")
  @Column(name="total_pages", nullable=false)
  private Integer total_pages;

  @Length(min=13, max=13)
  @NotNull(message="can't be blank")
  @Column(name="isbn", nullable=false)
  private String isbn;

  @Range(min=0, max=100)
  @NotNull(message="can't be blank")
  @Column(name="rating", nullable = false)
  private Integer rating;
}
