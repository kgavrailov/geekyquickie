package com.sap.geeky.quickie.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import java.util.List;

@Entity
public class Book {
	
	public Book() {
	}

	public Book(String isbn, String title, String language, List<Author> authors) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.language = language;
		this.authors = authors;
	}

	@Id
	private String isbn;

	@Size(min=2)
	private String title;

	private String language;

	@ManyToMany
	private List<Author> authors;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", language="
				+ language + "]";
	}
}
