package br.com.AppBarMvcClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.AppBarMvcClient.negocio.Pedido;
import br.com.AppBarMvcClient.service.PedidoService;


@Controller
public class PedidoController {
	
	/*
	 * @Autowired private ClienteService serviceCliente;
	 * 
	 * @Autowired private PedidoService pedidoService;
	 * 
	 * @Autowired private BebidaService bebidaService;
	 * 
	 * @Autowired private SobremesaService sobremesaService;
	 * 
	 * @Autowired private PetiscoService petiscoService;
	 */	 
	@Autowired 
	private PedidoService pedidoService;
	
	@RequestMapping(value = "/pedido", method = RequestMethod.GET)
	public String showDetalhe() {
		return "pedido/detalhe";
	}

	@RequestMapping(value = "/pedidos", method = RequestMethod.GET)
	public String obterLista(Model model) {
		/*
		 * model.addAttribute("clientesLista", serviceCliente.obterLista());
		 * model.addAttribute("bebidasLista", bebidaService.obterLista());
		 * model.addAttribute("petiscosLista", petiscoService.obterLista());
		 * model.addAttribute("sobremesaLista", sobremesaService.obterLista());
		 */
		model.addAttribute("pedidosLista", pedidoService.obterLista());

		return "pedido/lista";
	}

	@RequestMapping(value = "/pedido", method = RequestMethod.POST)
	public String incluir(Model model, Pedido pedido) {
		
		/*
		 * Optional<Cliente> _cliente =
		 * serviceCliente.obterPorId(pedido.getCliente().getId());
		 * 
		 * pedido.setDescricao("mesa 11"); pedido.setCliente(_cliente.get());
		 * 
		 * Optional<Bebida> bebida = bebidaService.obterPorId(1); Optional<Petisco>
		 * petisco = petiscoService.obterPorId(2); Optional<Sobremesa> sobremesa =
		 * sobremesaService.obterPorId(3);
		 * 
		 * Item itemBebida = new Item(); itemBebida.setDescricao("Cerveja");
		 * itemBebida.setProduto(bebida.get());
		 * 
		 * Item itemPetisco = new Item(); itemPetisco.setDescricao("Gurjão");
		 * itemPetisco.setProduto(petisco.get());
		 * 
		 * Item itemSobremesa = new Item(); itemSobremesa.setDescricao("Pudim");
		 * itemSobremesa.setProduto(sobremesa.get());
		 * 
		 * List<Item> itenspedidos = new ArrayList<Item>();
		 * itenspedidos.add(itemBebida); itenspedidos.add(itemPetisco);
		 * itenspedidos.add(itemSobremesa);
		 * 
		 * pedido.setItens(itenspedidos);
		 */
		
		pedidoService.incluir(pedido);

		return this.obterLista(model);
	}

	@RequestMapping(value = "/pedido/excluir/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {

		pedidoService.excluir(id);

		return this.obterLista(model);
	}

}