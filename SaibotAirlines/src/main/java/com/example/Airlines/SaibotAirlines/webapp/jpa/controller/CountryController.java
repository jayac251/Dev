package com.example.Airlines.SaibotAirlines.webapp.jpa.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.Airlines.SaibotAirlines.webapp.jpa.model.Cmn_Airports;
import com.example.Airlines.SaibotAirlines.webapp.jpa.model.Cmn_Countries;
import com.example.Airlines.SaibotAirlines.webapp.jpa.repository.AirportRepository;
import com.example.Airlines.SaibotAirlines.webapp.jpa.repository.CountryRepository;

@RestController
public class CountryController {

	@Autowired
	private CountryRepository cntryRepo;
	
	@GetMapping("/countries")
	public Iterable<Cmn_Countries> GetCountryList()
	{
		return cntryRepo.findAll();
		 		
	}
	
	@PostMapping("/countries")
	public ResponseEntity<Object> createCountry(@RequestBody Cmn_Countries country) {
		Cmn_Countries countries = cntryRepo.save(country);

//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(countries.getId()).toUri();
//
//		return ResponseEntity.created(location).build();
		
		if (countries==null)
		{
			return ResponseEntity.noContent().build();
		}

				return (ResponseEntity<Object>) ResponseEntity.status(HttpStatus.CREATED);

	}


}
