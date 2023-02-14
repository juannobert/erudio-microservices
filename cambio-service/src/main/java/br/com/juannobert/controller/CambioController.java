package br.com.juannobert.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.juannobert.model.Cambio;

@RestController
@RequestMapping("/cambio-service")
public class CambioController {

	@GetMapping("/{amount}/{from}/{to}")
	public Cambio getCambio(@PathVariable BigDecimal amount,
			@PathVariable String from,@PathVariable String to) {
		return new Cambio(1L,from,to,BigDecimal.ONE,BigDecimal.ONE,"PORT 8000");
	}
}
