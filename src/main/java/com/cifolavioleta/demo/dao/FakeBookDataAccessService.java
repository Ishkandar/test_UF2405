package com.cifolavioleta.demo.dao;

import com.cifolavioleta.demo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDAO")
public class FakeBookDataAccessService implements BookDAO {
    private static List<Book> db = new ArrayList<>();

    /******************** INSERT METHODS ********************/
    @Override
    public UUID insertBook(UUID id, Book book) {
        db.add(new Book(id, book.getTitle()));
        return id;
    }

    /******************** SELECT METHODS ********************/
    @Override
    public List<Book> selectAllBooks() {
        return db;
    }

    @Override
    public Optional<Book> selectBookById(UUID id) {
        return db.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst();
    }

    /******************** UPDATE METHODS ********************/
    @Override
    public int updateBookById(UUID id, Book book) {
        return selectBookById(id)
                .map(b -> {
                    int indexBookToUpdate = db.indexOf(b);
                    if (indexBookToUpdate >= 0) {
                        db.set(indexBookToUpdate, new Book(id, book.getTitle()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }

    /******************** DELETE METHODS ********************/
    @Override
    public int deleteBookById(UUID id) {
        Optional<Book> bookMaybe = selectBookById(id);
        if (bookMaybe.isEmpty()) {
            return 0;
        }
        db.remove(bookMaybe.get());
        return 1;
    }
}
