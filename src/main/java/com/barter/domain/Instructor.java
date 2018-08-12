package com.barter.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Instructor extends User {
		
	@ManyToMany
	 @JoinTable
	 (
		      joinColumns=@JoinColumn,
		      inverseJoinColumns=@JoinColumn)
	private List<Instrument> instruments = new ArrayList<Instrument>();

	public List<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}

}
