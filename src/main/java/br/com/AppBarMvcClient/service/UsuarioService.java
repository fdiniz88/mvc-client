package br.com.AppBarMvcClient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.AppBarMvcClient.negocio.Usuario;


@Service
public class UsuarioService {
	
	@Autowired
	private RestTemplate rest;

	public RestTemplate getRest() {
		return rest;
	}
	
	public boolean isValid(String login, String senha) {
		return "admin".equalsIgnoreCase(login) && 
			   "admin".equalsIgnoreCase(senha);

	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> obterLista(){
		
		return (List<Usuario>) rest.getForObject("http://localhost:8181/api/usuario/", List.class);
	}

	public void incluir(Usuario usuario) {
		rest.postForEntity("http://localhost:8181/api/usuario/", usuario, String.class);
	
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8181/api/usuario/{id}", id);
	}

}