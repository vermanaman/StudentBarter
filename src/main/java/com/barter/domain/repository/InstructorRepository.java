package com.barter.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.barter.domain.Instructor;
import com.barter.domain.Instrument;

public interface InstructorRepository extends CrudRepository<Instructor, String> {

	List<Instructor> findByInstrumentsId(Long instrument);
	
}
