package br.com.instalar.bookservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.instalar.bookservice.model.Book;
import br.com.instalar.bookservice.repository.BookRepository;

@RestController
@RequestMapping("book-service")
public class BookController {
	
	@Autowired
	private BookRepository repository;	
	@Autowired
	private Environment environment;

	@GetMapping(value = "/{id}/{currency}")
	public Book findBook(
			@PathVariable ("id") Long id,
			@PathVariable ("currency") String currency) {
		
		var book = repository.getById(id);
		if(book == null) {
			throw new RuntimeException("Book not found");
		}
		
		var port = environment.getProperty("local.server.port");
		book.setEnvironment(port);		
		
		return book;
	}
}
