package br.com.juannobert.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.juannobert.response.Cambio;

@FeignClient(name = "cambio-service" ,url = "localhost:8000")
public interface CambioProxy {

	@GetMapping("/cambio-service/{amount}/{from}/{to}")
	public Cambio getCambio(@PathVariable Double amount,
			@PathVariable String from,@PathVariable String to);
}
