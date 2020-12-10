package com.cifolavioleta.demo.model;

public class Quote {
		
	private int id;
	private String tag;
	private String sentence;
	private int numberWords;
	private Book book;
		
	public Quote() {
		super();
	}
	public Quote(int id, String sentence, int numberWords, Book book) {
		super();
		this.id = id;
		this.sentence = sentence;
		this.numberWords = numberWords;
		this.book = book;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSentence() {
		return sentence;
	}
	
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public int getNumberWords() {
		return numberWords;
	}
	
	public void setNumberWords(int numberWords) {
		this.numberWords = numberWords;
	}
	
	public Book getBook() {
		return book;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	@Override
	public String toString() {
		return "Quote [id=" + id + ", sentence=" + sentence + ", numberWords=" + numberWords + ", book=" + book + "]";
	}
}
