package com.cifolavioleta.demo.api;

import com.cifolavioleta.demo.model.Book;
import com.cifolavioleta.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/book")
@RestController
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping(path = "/add/")
    public void addBook(@Valid @NonNull @RequestBody Book book) {
        // requestBody nos sirve para que se recoja
        // el cuerpo de una petición POST y guardarla
        // como un nuevo objeto a añadir
        bookService.addBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // OJO por que en bookService se devuelve
    // un Optional, así que el objeto a retornar
    // debe incorporar un .orElse o similar.
    @GetMapping(path = "/get/{id}")
    public Book getBookById(@PathVariable UUID id) {
        return bookService.getBookById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteBookById(@PathVariable("id") UUID id) {
        bookService.deleteBook(id);
    }

    @PutMapping(path = "/modify/{id}")
    public void updateBook(@PathVariable("id") UUID id,
                           @Valid @NonNull @RequestBody Book newBook) {
        bookService.updateBook(id, newBook);
    }
}
