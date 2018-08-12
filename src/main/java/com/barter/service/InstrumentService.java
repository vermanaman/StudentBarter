package com.barter.service;

import java.util.List;

import com.barter.domain.Instrument;

public interface InstrumentService {

	List<Instrument> getInstruments();
	
	Instrument saveOrUpdate(Instrument instrument);
}
