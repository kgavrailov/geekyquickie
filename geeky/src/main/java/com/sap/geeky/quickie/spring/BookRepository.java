package com.sap.geeky.quickie.spring;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

import com.sap.geeky.quickie.spring.model.Book;

@RestResource(path = "books", rel = "books")
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
	// TODO find by book name
	// TODO find all books of an author (Parametrize the input parameter also the Query annotation)
}
