package br.com.AppBarMvcClient.negocio;


public abstract class Produto {

	
	private Integer id;
	
	private String descricao;
	
	private Float preco;

	public Produto() {

	}

	public Produto(Integer id, String descricao, Float preco) {
		this();
		this.setId(id);
		this.setDescricao(descricao);
		this.setPreco(preco);
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

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

}
