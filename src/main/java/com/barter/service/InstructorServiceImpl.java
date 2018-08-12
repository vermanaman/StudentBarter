package com.barter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barter.domain.Instructor;
import com.barter.domain.Instrument;
import com.barter.domain.repository.InstructorRepository;

@Component
public class InstructorServiceImpl implements InstructorService {
	
	@Autowired
	private InstructorRepository instructorRepository;

	@Override
	public List<Instructor> getInstructors(Long instrument) {
		List<Instructor> list = new ArrayList<>();
		
		for (Instructor course : instructorRepository.findByInstrumentsId(instrument)) {
			list.add(course);
		}
		return list;
	}

}
