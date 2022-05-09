package com.simuladorinvestimento.simuladorInvestimento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simuladorinvestimento.simuladorInvestimento.DTO.InvestimentoPay;
import com.simuladorinvestimento.simuladorInvestimento.model.Investimento;
import com.simuladorinvestimento.simuladorInvestimento.service.InvestimentoService;

@RestController
//@RequestMapping("/investimento")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class InvestimentoController {
	
	  @Autowired
	    private InvestimentoService investimentoService;
	  
	  
	 
	    @GetMapping("/investimento")
	    public List<InvestimentoPay> getAll() {
	        List<InvestimentoPay> responses = new ArrayList<>();

	        for (Investimento investimento : investimentoService.getAll()) {
	            responses.add(new InvestimentoPay(investimento));
	        }

	        return responses;
	    }

//	    @PostMapping("/investimento/{investimento}")
//	    public InvestimentoPay create(@RequestBody InvestimentoPay investimentoPay) {
//	        Investimento investimento = investimentoPay.buildEntity();
//	        return new InvestimentoPay(investimentoService.create(investimento));
//
//}
}
