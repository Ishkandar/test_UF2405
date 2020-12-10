package com.cifolavioleta.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.cifolavioleta.demo.model.Quote;

public interface QuoteDAO {
	UUID insertQuote(UUID id, Quote quote);
	
	default UUID insertQuote(Quote quote) {
		UUID id = UUID.randomUUID();
		return insertQuote(id, quote);
		
	}
	
	List<Quote> selectAllQuotes();
	
	Optional<Quote> selectQuoteById(UUID id);
	
	int deleteQuoteById(UUID id);
	
	int updateQuoteById(UUID id, Quote quote);
}
