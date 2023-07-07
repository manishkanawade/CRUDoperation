package com.qio.report.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qio.report.entity.Thief;
import com.qio.report.repository.thiefRepository;
import com.qio.report.service.thiefService;
@Service
public class thiefServiceImpl implements thiefService {
	
	@Autowired
	thiefRepository thiefRepository;

	@Override
	public Thief addThief(Thief thief) {
		
		return this.thiefRepository.save(thief);
	}

	@Override
	public List<Thief> getThief() {
		
		return this.thiefRepository.findAll();
	}

	@Override
	public Thief updateThief(Thief thief) {
		
		return this.thiefRepository.save(thief);
	}

	@Override
	public String deleteThief(Long thiefId) {
		this.thiefRepository.deleteById(thiefId);
		return "record deleted success";
	}

}
