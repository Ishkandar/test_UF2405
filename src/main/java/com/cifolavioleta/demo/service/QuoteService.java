package com.cifolavioleta.demo.service;

import com.cifolavioleta.demo.dao.QuoteDAO;
import com.cifolavioleta.demo.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class QuoteService {
    private final QuoteDAO quoteDao;

    @Autowired
    public QuoteService(@Qualifier("H2") QuoteDAO quoteDao) {
        this.quoteDao = quoteDao;
    }

    public UUID addBook(Quote quote) {
        return quoteDao.insertQuote(quote);
    }

    public List<Quote> getAllBooks() {
        List<Quote> quotes = session
    	//return quoteDao.selectAllQuotes();
    }

    public Optional<Quote> getQuoteById(UUID id) {
        return quoteDao.selectQuoteById(id);
    }

    public int deleteBook(UUID id) {
        return quoteDao.deleteQuoteById(id);
    }

    public int updateBook(UUID id, Quote newQuote) {
        return quoteDao.updateQuoteById(id, newQuote);
    }
}