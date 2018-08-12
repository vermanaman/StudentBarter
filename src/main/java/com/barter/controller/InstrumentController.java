package com.barter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.barter.domain.Instrument;
import com.barter.service.InstrumentService;

@RestController
public class InstrumentController {
	
	@Autowired
	private InstrumentService instrumentService;

	@RequestMapping(path="/saveCourse", method = RequestMethod.POST)
	public String saveOrUpdate(@RequestBody Instrument instrument){
		instrumentService.saveOrUpdate(instrument);
		System.out.println("Instrument saved!" + instrument);
		return "home";
	}

	@RequestMapping(path="/getInstruments", method = RequestMethod.GET)
	public List<Instrument> getInstruments(){
		System.out.println("Instrument retrieval!");
		return instrumentService.getInstruments();
	}
}
