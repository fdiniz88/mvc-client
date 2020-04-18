package br.com.AppBarMvcClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.AppBarMvcClient.negocio.Petisco;
import br.com.AppBarMvcClient.service.PetiscoService;

@Controller
@SessionAttributes("petisco")
public class PetiscoController {

	@Autowired
	private PetiscoService service;
	
	
	@RequestMapping(value = "/petisco", method = RequestMethod.GET)
	public String showDetalhe() {
		return "petisco/detalhe";
	}
	
	@RequestMapping(value = "/petiscos", method = RequestMethod.GET)
	public String obterLista(Model model) {
		
		model.addAttribute("petiscosLista", service.obterLista());
		
		return "petisco/lista";
	}
	
	@RequestMapping(value = "/petisco", method = RequestMethod.POST)
	public String incluir(
			Model model,
			Petisco petisco
			) {		
		service.incluir(petisco);
		
		return this.obterLista(model);
	}
	
	@RequestMapping(value = "/petisco/excluir/{id}", method = RequestMethod.GET)
	public String excluir(
			Model model, 
			@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.obterLista(model);
	}

	public PetiscoService getService() {
		return service;
	}
	public void setService(PetiscoService service) {
		this.service = service;
	}
}