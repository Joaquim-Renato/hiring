package com.simuladorinvestimento.simuladorInvestimento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simuladorinvestimento.simuladorInvestimento.model.Investimento;
import com.simuladorinvestimento.simuladorInvestimento.repository.InvestimentoRepository;

@Service
public class InvestimentoService {

	@Autowired
	private InvestimentoRepository investimentoRepository;
	private double taxa;
	
	public List<Investimento> getAll(){
		return investimentoRepository.findAll();
	}
	public Investimento create(Investimento investimento) {
		calculaMontante(investimento);
		return investimentoRepository.save(investimento);
	}
	
	public void calculaMontante(Investimento investimento) {
		taxa = 0.008;
		investimento.setMontante(investimento.getValor()* Math.pow(1 + taxa, investimento.getQuantidadeMeses()));
	}
}
