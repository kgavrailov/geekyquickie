package com.sap.geeky.quickie.spring;

import com.sap.geeky.quickie.spring.model.Author;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

@RestResource(path = "authors", rel = "authors")
public interface AuthorRepository extends PagingAndSortingRepository<Author, Integer> {
	// TODO find all books of an author
}
