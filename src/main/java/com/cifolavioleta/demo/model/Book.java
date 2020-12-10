package com.cifolavioleta.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.UUID;

@Entity
@Table(name = "book")
public class Book {
	@Id
    private final UUID id;
    @NotBlank
    private final String title;
    @OneToMany(mappedBy = "book")
    private ArrayList<Quote> quotes;

    public Book(@JsonProperty("id") UUID id, @JsonProperty("title") String title) {
        this.id = id;
        this.title = title;
        this.quotes = new ArrayList<>();
    }

    public UUID getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<Quote> getQuotes() {
        return this.quotes;
    }

    public void setQuotes(ArrayList<Quote> quotes) {
        this.quotes = quotes;
    }

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
