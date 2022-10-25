package com.shashi.library.management.DataAccessLayer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query(value = "SELECT * FROM Book WHERE Author = ?1", nativeQuery = true)
    List<Book> searchBooksByAuthor(String author);

    @Query(value = "SELECT * FROM Book WHERE Subject = ?1", nativeQuery = true)
    List<Book> searchBooksBySubject(String subject);
}
