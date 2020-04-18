package br.com.AppBarMvcClient.negocio;



public class Item {

	private Integer id;

	private String descricao;

	private Pedido pedido;	
	
	private Produto produto;

	public Item() {
	}

	public Item(String descricao, Produto produto, Pedido pedido) {
		this();
		setDescricao(descricao);
		setProduto(produto);
		setPedido(pedido);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}