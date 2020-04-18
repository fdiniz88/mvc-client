package br.com.AppBarMvcClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.AppBarMvcClient.negocio.Bebida;
import br.com.AppBarMvcClient.service.BebidaService;

@Controller
@SessionAttributes("bebida")
public class BebidaController {

	@Autowired
	private BebidaService service;

	@RequestMapping(value = "/bebida", method = RequestMethod.GET)
	public String showDetalhe() {
		return "bebida/detalhe";
	}

	@RequestMapping(value = "/bebidas", method = RequestMethod.GET)
	public String obterLista(Model model) {

		model.addAttribute("bebidasLista", service.obterLista());

		return "bebida/lista";
	}

	@RequestMapping(value = "/bebida", method = RequestMethod.POST)
	public String incluir(Model model, Bebida bebida) {

		service.incluir(bebida);

		return this.obterLista(model);
	}

	@RequestMapping(value = "/bebida/excluir/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {

		service.excluir(id);

		return this.obterLista(model);
	}

	public BebidaService getService() {
		return service;
	}

	public void setService(BebidaService service) {
		this.service = service;
	}
}