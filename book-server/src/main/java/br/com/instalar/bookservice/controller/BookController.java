package br.com.instalar.bookservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.instalar.bookservice.model.Book;

@RestController
@RequestMapping("book-service")
public class BookController {

	@RequestMapping("/{id}/currency")
	public Book findBook(
			@PathVariable ("id") Long id,
			@PathVariable ("currency") String currency) {
		
		
		return new Book();
	}
}
