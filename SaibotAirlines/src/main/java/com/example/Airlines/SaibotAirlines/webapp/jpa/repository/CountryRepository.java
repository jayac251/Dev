package com.example.Airlines.SaibotAirlines.webapp.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.Airlines.SaibotAirlines.webapp.jpa.model.Cmn_Countries;

@Repository
public interface CountryRepository extends CrudRepository<Cmn_Countries, Integer> {
	

}
