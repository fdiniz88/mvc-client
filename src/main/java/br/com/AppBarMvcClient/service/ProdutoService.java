package br.com.AppBarMvcClient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.AppBarMvcClient.negocio.Produto;



@Service
public class ProdutoService {
	
	@Autowired
	private RestTemplate rest;

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}

	@SuppressWarnings("unchecked")
	public List<Produto> obterLista() {
		return (List<Produto>) rest.getForObject("http://localhost:8181/api/produto/", List.class);
	}

	public Optional<Produto> obterPorId(Integer id) {
		return null;
	}

	public void incluir(Produto produto) {
		// ResponseEntity<String> valor =
		rest.postForEntity("http://localhost:8181/api/produto/", produto, String.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8181/api/produto/{id}", id);
	}
}
