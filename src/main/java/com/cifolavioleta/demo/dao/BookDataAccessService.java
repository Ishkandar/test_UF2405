package com.cifolavioleta.demo.dao;

import com.cifolavioleta.demo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgresql")
public class BookDataAccessService implements BookDAO{
    @Override
    public UUID insertBook(UUID id, Book book) {
        return null;
    }

    @Override
    public UUID insertBook(Book book) {
        return null;
    }

    @Override
    public List<Book> selectAllBooks() {
        return List.of(new Book(UUID.randomUUID(), "From PostGreSQL-DB"));
    }

    @Override
    public Optional<Book> selectBookById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteBookById(UUID id) {
        return 0;
    }

    @Override
    public int updateBookById(UUID id, Book book) {
        return 0;
    }
}
