package com.qio.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qio.report.entity.Casee;
import com.qio.report.serviceImpl.CaseServiceImpl;
@RestController
public class CaseController {
	
	@Autowired
	CaseServiceImpl caseServiceImpl;
	
	@PostMapping("/case")
	public ResponseEntity<Casee> addCase(@RequestBody Casee casee){
		Casee c=this.caseServiceImpl.addCase(casee);
		return new ResponseEntity<Casee>(c, HttpStatus.OK);
	}
	
	@GetMapping("/case")
	public ResponseEntity<List<Casee>> getCase(){
		List<Casee> c=this.caseServiceImpl.getCase();
		return new ResponseEntity<List<Casee>>(c, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/case")
	public ResponseEntity<Casee> updateCase(@RequestBody Casee casee){
		Casee c=this.caseServiceImpl.updateCase(casee);
		return new ResponseEntity<Casee>(c, HttpStatus.OK);
	}
	
	@DeleteMapping("/case")
	public ResponseEntity<String> deleteCase(@RequestParam Long caseID){
		String c=this.caseServiceImpl.deleteCase(caseID);
		return new ResponseEntity<String>(c, HttpStatus.ACCEPTED);
	}
}
