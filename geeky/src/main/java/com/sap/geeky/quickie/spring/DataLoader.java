package com.sap.geeky.quickie.spring;

import java.util.Arrays;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.sap.geeky.quickie.spring.model.Author;
import com.sap.geeky.quickie.spring.model.Book;

public class DataLoader implements InitializingBean {
	
	@Autowired
	AuthorRepository authors;
	
	@Autowired
	BookRepository books;

	public void afterPropertiesSet() throws Exception {
		Author ivanVazov = new Author("Ivan Vazov");
		Author peyoYavorov = new Author("Peyo Yavorov");
		authors.save(Arrays.asList(ivanVazov, peyoYavorov));
		books.save(Arrays.asList(new Book("isb123456", "Pod Igoto", "bg", Arrays.asList(ivanVazov))));
		books.save(Arrays.asList(new Book("isb123457", "Gradushka", "bg", Arrays.asList(peyoYavorov))));
	}
}
