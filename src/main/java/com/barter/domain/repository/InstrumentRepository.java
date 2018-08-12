package com.barter.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.barter.domain.Instrument;

public interface InstrumentRepository extends CrudRepository<Instrument, String> {

	Instrument findByName(String instrument);
	
}
