package br.com.AppBarMvcClient.negocio;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;



public class Sobremesa extends Produto {
	
	
	
	private LocalDate validade;
	
	private String tamanho;
	
	private boolean isFeitoHone;
	

	public Sobremesa()	{
		super();
	}

	public Sobremesa(LocalDate validade, String tamanho, boolean isFeitoHone) {
		super();
		this.setValidade(validade);
		this.setTamanho(tamanho);
		this.setFeitoHone(isFeitoHone);
	}

	
	/*
	 * public Sobremesa(Integer id, String descricao, Float preco) { super(id,
	 * descricao, preco); }
	 */
	
	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isFeitoHone() {
		return isFeitoHone;
	}

	public void setFeitoHone(boolean isFeitoHone) {
		this.isFeitoHone = isFeitoHone;
	}


	
	@Override
	public String toString() {
		return "Sobremesa -> tamanho=" + this.getTamanho() 
				+ ", validade="	+ this.getValidade() 
				+ ", feito hoje=" + this.isFeitoHone;
	}
}
