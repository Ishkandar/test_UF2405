package com.cifolavioleta.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Book {
    private final UUID id;
    @NotBlank
    private final String title;
    // private ArrayList<Quote> quotes;

    public Book(@JsonProperty("id") UUID id, @JsonProperty("title") String title) {
        this.id = id;
        this.title = title;
    }

    public UUID getId() {
        return this.id;
    }

//    public void setId(UUID id) {
//        this.id = id;
//    }

    public String getTitle() {
        return this.title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

//    public ArrayList<Quote> getQuotes() {
//        return this.quotes;
//    }

//    public void setQuotes(ArrayList<Quotes> quotes) {
//        this.quotes = quotes;
//    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name='" + title + '\'' + ", author=" + '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() == obj.getClass()) return true;

        Book bookObj = (Book) obj;

        if (id == bookObj.id
                && title.equals(bookObj.title)) {
            return true;
        }

        return false;
    }
}
