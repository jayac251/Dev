package com.example.Airlines.SaibotAirlines.webapp.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.Airlines.SaibotAirlines.webapp.jpa.model.Cmn_Countries;

@RepositoryRestResource
public interface CountryRepository extends CrudRepository<Cmn_Countries, Integer> {

}
