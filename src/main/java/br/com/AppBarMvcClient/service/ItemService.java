package br.com.AppBarMvcClient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.AppBarMvcClient.negocio.Item;

@Service
public class ItemService {


	@Autowired
	private RestTemplate rest;

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}

	@SuppressWarnings("unchecked")
	public List<Item> obterLista() {
		return (List<Item>) rest.getForObject("http://localhost:8181/api/item/", List.class);
	}

	public Optional<Item> obterPorId(Integer id) {
		return null;
	}

	public void incluir(Item item) {
		// ResponseEntity<String> valor =
		rest.postForEntity("http://localhost:8181/api/item/", item, String.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8181/api/item/{id}", id);
	}
}
