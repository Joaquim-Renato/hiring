package com.simuladorinvestimento.simuladorInvestimento.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.simuladorinvestimento.simuladorInvestimento.model.Investimento;

public interface InvestimentoRepository extends CrudRepository<Investimento, Long> {
	List<Investimento> findAll();
}
