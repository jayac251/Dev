package com.example.Airlines.SaibotAirlines.webapp.jpa.controller;

import com.example.Airlines.SaibotAirlines.webapp.jpa.repository.AirportRepository;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.Airlines.SaibotAirlines.webapp.jpa.model.Cmn_Airports;

@RestController
public class AirportController {
	
	@Autowired
	private AirportRepository airRepo;
	
	@GetMapping("/airports")
	public List<Cmn_Airports> GetAirportList()
	{
		return  (List<Cmn_Airports>) airRepo.findAll();
		 		
	}
	
	@PostMapping("/airports")
	public ResponseEntity<Object> createStudent(@RequestBody Cmn_Airports airport) {
		Cmn_Airports airports = airRepo.save(airport);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(airports.getId()).toUri();

		return ResponseEntity.created(location).build();

	}

}
