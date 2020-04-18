package br.com.AppBarMvcClient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.AppBarMvcClient.negocio.Bebida;





@Service
public class BebidaService {
	
	@Autowired
	private RestTemplate rest;

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
	
	@SuppressWarnings("unchecked")
	public List<Bebida> obterLista() {
		return (List<Bebida>) rest.getForObject("http://localhost:8181/api/Bebida/", List.class);
	}

	public Optional<Bebida> obterPorId(Integer id) {
		return null;
	}

	public void incluir(Bebida bebida) {
		// ResponseEntity<String> valor =
		rest.postForEntity("http://localhost:8181/api/Bebida/", bebida, String.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8181/api/Bebida/{id}", id);
	}
}
