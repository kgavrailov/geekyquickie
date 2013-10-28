package com.sap.geeky.quickie.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfiguration.class);
		BookRepository repository = context.getBean(BookRepository.class);
		// TODO fetch all customers

		// TODO fetch an individual customer by ID

		// TODO fetch customers by last name

		// TODO save customer with invalid name
		context.close();
	}
}
