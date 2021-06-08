package com.launchacademy.library.repositories;

import com.launchacademy.library.models.Book;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, Integer> {

  public List<Book> findAllByTitle(String title);
}
