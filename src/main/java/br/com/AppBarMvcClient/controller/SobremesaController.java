package br.com.AppBarMvcClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.AppBarMvcClient.negocio.Sobremesa;
import br.com.AppBarMvcClient.service.SobremesaService;

@Controller
@SessionAttributes("sobremesa")
public class SobremesaController {

	@Autowired
	private SobremesaService service;
	
	
	@RequestMapping(value = "/sobremesa", method = RequestMethod.GET)
	public String showDetalhe() {
		return "sobremesa/detalhe";
	}
	
	@RequestMapping(value = "/sobremesas", method = RequestMethod.GET)
	public String obterLista(Model model) {
		
		model.addAttribute("sobremesasLista", service.obterLista());
		
		return "sobremesa/lista";
	}
	
	@RequestMapping(value = "/sobremesa", method = RequestMethod.POST)
	public String incluir(
			Model model,
			Sobremesa sobremesa
			) {
		
		service.incluir(sobremesa);
		
		return this.obterLista(model);
	}
	
	@RequestMapping(value = "/sobremesa/excluir/{id}", method = RequestMethod.GET)
	public String excluir(
			Model model, 
			@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.obterLista(model);
	}

	public SobremesaService getService() {
		return service;
	}
	public void setService(SobremesaService service) {
		this.service = service;
	}
}