package com.qio.report.service;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.qio.report.entity.Casee;

@RestController
public interface CaseService {
	
	public Casee addCase(Casee casee);
	
	public List<Casee> getCase();
	
	public Casee updateCase(Casee casee);
	
	public String deleteCase(Long caseID);
	

}
