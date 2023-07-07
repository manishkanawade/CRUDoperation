package com.qio.report.service;

import java.util.List;

import com.qio.report.entity.Thief;

public interface thiefService {
	
	public Thief addThief(Thief thief);
	
	public List<Thief> getThief();
	
	public Thief updateThief(Thief thief);
	
	public String deleteThief(Long thiefId);

}
