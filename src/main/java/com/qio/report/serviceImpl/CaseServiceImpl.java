package com.qio.report.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qio.report.entity.Casee;
import com.qio.report.repository.CaseRepository;
import com.qio.report.service.CaseService;

@Service
public class CaseServiceImpl implements CaseService {
	
	@Autowired
	CaseRepository caseRepository;

	@Override
	public Casee addCase(Casee casee) {
	
		return this.caseRepository.save(casee);
	}

	@Override
	public List<Casee> getCase() {
		
		return this.caseRepository.findAll();
	}

	@Override
	public Casee updateCase(Casee casee) {
		
		return this.caseRepository.save(casee);
	}

	@Override
	public String deleteCase(Long caseID) {
		this.caseRepository.deleteById(caseID);
		return "deleted........";
	}

}
