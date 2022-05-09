package com.simuladorinvestimento.simuladorInvestimento.DTO;

import com.simuladorinvestimento.simuladorInvestimento.model.Investimento;

public class InvestimentoPay {
	private double valor;
	
	private int quantidadeMeses;
	
	private double montante;

	// Get/Set
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
	
	
	public InvestimentoPay() {
}
	public InvestimentoPay(Investimento investimento) {
		setValor(investimento.getValor());
		setQuantidadeMeses(investimento.getQuantidadeMeses());
		setMontante(investimento.getMontante());
		return;
		
	}

	  public Investimento buildEntity() {
	        Investimento investimento = new Investimento();
	        investimento.setValor(getValor());
	        investimento.setQuantidadeMeses(getQuantidadeMeses());
	        investimento.setMontante(getMontante());
	        return investimento;
	    }
		
	}

