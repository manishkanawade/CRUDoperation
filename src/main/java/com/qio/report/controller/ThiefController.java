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

import com.qio.report.entity.Thief;
import com.qio.report.serviceImpl.thiefServiceImpl;

@RestController
public class ThiefController {
	
	@Autowired
	thiefServiceImpl thiefServiceImpl;
	
	@PostMapping("/thief")
	public ResponseEntity<Thief> addThief(@RequestBody Thief thief) {
	Thief t=this.thiefServiceImpl.addThief(thief);
		return new ResponseEntity<Thief>(t, HttpStatus.OK);
	}
	
	@GetMapping("/thief")
	public ResponseEntity<List<Thief>> getThief(){
		List<Thief> t=this.thiefServiceImpl.getThief();
		return new ResponseEntity<List<Thief>>(t, HttpStatus.OK);
	}
	
	@PutMapping("/thief")
	public ResponseEntity<Thief> updateThief(@RequestBody Thief thief){
		Thief t=this.thiefServiceImpl.updateThief(thief);
		return new ResponseEntity<Thief>(t, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/thief")
	public ResponseEntity<String> deleteThief(@RequestParam Long thiefId) {
		String t=this.thiefServiceImpl.deleteThief(thiefId);
		return new ResponseEntity<String>(t, HttpStatus.ACCEPTED);
	}
}
