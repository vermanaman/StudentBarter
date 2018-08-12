package com.barter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barter.domain.Instrument;
import com.barter.domain.repository.InstrumentRepository;

@Component
public class InstrumentServiceImpl implements InstrumentService {
	
	@Autowired
	private InstrumentRepository instrumentRepo;

	@Override
	public List<Instrument> getInstruments() {
		List<Instrument> list = new ArrayList<>();
		for (Instrument course : instrumentRepo.findAll()) {
			list.add(course);
		}
		return list;
	}

	@Override
	public Instrument saveOrUpdate(Instrument instrument) {
		return instrumentRepo.save(instrument);
	}

}
