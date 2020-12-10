package com.cifolavioleta.demo.service;

import com.cifolavioleta.demo.dao.BookDAO;
import com.cifolavioleta.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {
    private final BookDAO bookDao;

    @Autowired
    public BookService(@Qualifier("postgresql") BookDAO bookDao) {
        this.bookDao = bookDao;
    }

    public UUID addBook(Book book) {
        return bookDao.insertBook(book);
    }

    public List<Book> getAllBooks() {
        return bookDao.selectAllBooks();
    }

    public Optional<Book> getBookById(UUID id) {
        return bookDao.selectBookById(id);
    }

    public int deleteBook(UUID id) {
        return bookDao.deleteBookById(id);
    }

    public int updateBook(UUID id, Book newBook) {
        return bookDao.updateBookById(id, newBook);
    }
}
