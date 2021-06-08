package com.launchacademy.library.controllers;

import com.launchacademy.library.models.Book;
import com.launchacademy.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BooksRestController {

  private BookRepository bookRepo;

  @Autowired
  public BooksRestController(BookRepository bookRepo) {this.bookRepo = bookRepo;}

  @GetMapping
  public Iterable<Book> getAllBooks() {
    return bookRepo.findAll();
  }
}
