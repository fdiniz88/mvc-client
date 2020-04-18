package br.com.AppBarMvcClient.negocio;
import java.util.ArrayList;
import java.util.List;



public class Pedido {



	private Integer id;

	private String descricao;

	private Cliente cliente;


	private List<Item> itens;

	public Pedido() {
		itens = new ArrayList<Item>();
	}

	public Pedido(Integer id, String descricao) {
		this();
		this.setId(id);
		this.setDescricao(descricao);
	}

	@Override
	public String toString() {
		return String.format(this.getCliente() + ", produtos=" + this.getItens());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
}
