package br.com.AppBarMvcClient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.AppBarMvcClient.negocio.Pedido;


@Service
public class PedidoService {
	

	@Autowired
	private RestTemplate rest;

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}

	@SuppressWarnings("unchecked")
	public List<Pedido> obterLista() {
		return (List<Pedido>) rest.getForObject("http://localhost:8181/api/pedido/", List.class);
	}

	public Optional<Pedido> obterPorId(Integer id) {
		return null;
	}

	public void incluir(Pedido pedido) {
		// ResponseEntity<String> valor =
		rest.postForEntity("http://localhost:8181/api/pedido/", pedido, String.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8181/api/pedido/{id}", id);
	}
}
