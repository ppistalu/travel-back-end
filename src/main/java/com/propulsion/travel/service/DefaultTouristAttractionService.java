package com.propulsion.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.propulsion.travel.domain.TouristAttraction;
import com.propulsion.travel.repository.TouristAttractionRepository;

@Service
@Transactional
public class DefaultTouristAttractionService implements TouristAttractionService {

	private TouristAttractionRepository repository;
	
	@Autowired
	public DefaultTouristAttractionService(TouristAttractionRepository repository) {
		this.repository = repository;
	}


	@Override
	public TouristAttraction findbyId(Long Id) {
		return repository.findById(Id);
	}

}
