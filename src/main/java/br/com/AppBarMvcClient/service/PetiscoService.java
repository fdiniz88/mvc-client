package br.com.AppBarMvcClient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.AppBarMvcClient.negocio.Petisco;

@Service
public class PetiscoService {
	
	@Autowired
	private RestTemplate rest;

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}

	@SuppressWarnings("unchecked")
	public List<Petisco> obterLista() {
		return (List<Petisco>) rest.getForObject("http://localhost:8181/api/petisco/", List.class);
	}

	public Optional<Petisco> obterPorId(Integer id) {
		return null;
	}

	public void incluir(Petisco petisco) {
		// ResponseEntity<String> valor =
		rest.postForEntity("http://localhost:8181/api/petisco/", petisco, String.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8181/api/petisco/{id}", id);
	}
}