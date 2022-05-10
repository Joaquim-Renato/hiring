package com.simuladorinvestimento.simuladorInvestimento.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="tb_investimento")
public class Investimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private double valor;
	
	@NotNull
	private int quantidadeMeses;
	
	@NotNull
	private double montante;
	
	private String observacao;

	public long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getQuantidadeMeses() {
		return quantidadeMeses;
	}


	public void setQuantidadeMeses(int quantidadeMeses) {
		this.quantidadeMeses = quantidadeMeses;
	}


	public double getMontante() {
		return montante;
	}


	public void setMontante(double montante) {
		this.montante = montante;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}




	
}
