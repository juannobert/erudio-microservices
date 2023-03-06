package br.com.juannobert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.juannobert.model.Book;
import br.com.juannobert.proxy.CambioProxy;
import br.com.juannobert.repository.BookRepository;
import br.com.juannobert.response.Cambio;

@RestController
@RequestMapping("/book-service")
public class BookController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private BookRepository repository;
	
	@Autowired
	private CambioProxy proxy;
	
	@GetMapping("/{id}/{currency}")
	public Book findBook(@PathVariable Long id,@PathVariable String currency) {
		Book book = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Book not found"));
		String port= environment.getProperty("local.server.port");
		
		Cambio cambio = proxy.getCambio(book.getPrice(), "USD", currency);
		book.setEnviroment(port + " FEIGN");
		book.setPrice(cambio.getConvertedValue());
		return book;
	}
	

}
