package com.propulsion.travel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propulsion.travel.domain.RouteTouristAttraction;
import com.propulsion.travel.domain.TouristAttraction;

@Repository
public interface TouristAttractionRepository extends JpaRepository<TouristAttraction, Long> {

	TouristAttraction findById(Long id);
	
	TouristAttraction findByName(String name);
}
