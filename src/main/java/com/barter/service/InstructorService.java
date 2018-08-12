package com.barter.service;

import java.util.List;

import com.barter.domain.Instructor;
import com.barter.domain.Instrument;

public interface InstructorService {

	List<Instructor> getInstructors(Long instrument);
	
}
