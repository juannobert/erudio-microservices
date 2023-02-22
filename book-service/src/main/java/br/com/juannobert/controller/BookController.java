package br.com.juannobert.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.juannobert.model.Book;

@RestController
@RequestMapping("/book-service")
public class BookController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/{id}/{currency}")
	public Book findBook(@PathVariable Long id,@PathVariable String currency) {
		String port= environment.getProperty("local.server.port");
		
		return new Book(1L, "Nigel Poulton", new Date(), Double.valueOf(13.7), 
				currency, port);
	}
	

}
