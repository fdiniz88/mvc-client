package br.com.AppBarMvcClient.negocio;


public class Cliente {

	
	private Integer id;
	
	private String nome;
	
	private long idade;
	
	private String genero;	
	
	public Cliente() {	
	}

	@Override
	public String toString() {
		return "Cliente -> nome=" + this.getNome() + ", idade=" + this.getIdade() + ", g�nero=" + this.getGenero();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getIdade() {
		return idade;
	}
	public void setIdade(long idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}