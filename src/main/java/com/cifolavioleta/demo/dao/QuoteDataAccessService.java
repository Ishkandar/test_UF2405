package com.cifolavioleta.demo.dao;

import com.cifolavioleta.demo.model.Book;
import com.cifolavioleta.demo.model.Quote;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

@Repository("H2")
public class QuoteDataAccessService implements QuoteDAO{

	@Override
	public UUID insertQuote(UUID id, Quote quote) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quote> selectAllQuotes() {
		return List.of(new Quote(UUID.randomUUID(), "From H2-DB"));
	}

	@Override
	public Optional<Quote> selectQuoteById(UUID id) {
		return Optional.empty();
	}

	@Override
	public int deleteQuoteById(UUID id) {
		return 0;
	}

	@Override
	public int updateQuoteById(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
