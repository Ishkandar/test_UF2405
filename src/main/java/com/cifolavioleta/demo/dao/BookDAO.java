package com.cifolavioleta.demo.dao;

import com.cifolavioleta.demo.model.Book;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookDAO {
    UUID insertBook(UUID id, Book book);

    default UUID insertBook(Book book) {
        UUID id = UUID.randomUUID();
        return insertBook(id, book);
    }

    List<Book> selectAllBooks();

    Optional<Book> selectBookById(UUID id);

    int deleteBookById(UUID id);

    int updateBookById(UUID id, Book book);
}
