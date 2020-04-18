package br.com.AppBarMvcClient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.AppBarMvcClient.negocio.Sobremesa;



@Service
public class SobremesaService {
	
	@Autowired
	private RestTemplate rest;

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}

	@SuppressWarnings("unchecked")
	public List<Sobremesa> obterLista() {
		return (List<Sobremesa>) rest.getForObject("http://localhost:8181/api/sobremesa/", List.class);
	}

	public Optional<Sobremesa> obterPorId(Integer id) {
		return null;
	}

	public void incluir(Sobremesa sobremesa) {
		// ResponseEntity<String> valor =
		rest.postForEntity("http://localhost:8181/api/sobremesa/", sobremesa, String.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8181/api/sobremesa/{id}", id);
	}
}
