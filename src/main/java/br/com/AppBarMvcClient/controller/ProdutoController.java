package br.com.AppBarMvcClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.AppBarMvcClient.negocio.Produto;
import br.com.AppBarMvcClient.service.ProdutoService;

@Controller
@SessionAttributes("produto")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	
	@RequestMapping(value = "/produto", method = RequestMethod.GET)
	public String showDetalhe() {
		return "produto/detalhe";
	}
	
	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	public String obterLista(Model model) {
		
		model.addAttribute("produtosLista", service.obterLista());
		
		return "produto/lista";
	}
	
	@RequestMapping(value = "/produto", method = RequestMethod.POST)
	public String incluir(
			Model model,
			Produto produto
			) {
		
		service.incluir(produto);
		
		return this.obterLista(model);
	}
	
	@RequestMapping(value = "/produto/excluir/{id}", method = RequestMethod.GET)
	public String excluir(
			Model model, 
			@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.obterLista(model);
	}

	public ProdutoService getService() {
		return service;
	}
	public void setService(ProdutoService service) {
		this.service = service;
	}
}