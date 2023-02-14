package br.com.juannobert.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.juannobert.model.Cambio;
import br.com.juannobert.repository.CambioRepository;

@RestController
@RequestMapping("/cambio-service")
public class CambioController {

	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CambioRepository repository;
	
	
	@GetMapping("/{amount}/{from}/{to}")
	public Cambio getCambio(@PathVariable BigDecimal amount,
			@PathVariable String from,@PathVariable String to) {
		Cambio cambio = repository.findByFromAndTo(from, to);
		if(cambio == null) throw new RuntimeException("Currency Unsupported");
		BigDecimal convertedValue = cambio.getConversionFactor().multiply(amount);
		String port = environment.getProperty("local.server.port");
		cambio.setConvertedValue(convertedValue);
		cambio.setEnvironment(port);
		return cambio;
	}
}
