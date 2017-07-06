package com.propulsion.travel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propulsion.travel.domain.Route;
import com.propulsion.travel.domain.RouteTouristAttraction;
import com.propulsion.travel.domain.TouristAttraction;

@Repository
public interface RouteTouristAttractionRepository  extends JpaRepository<RouteTouristAttraction, Long> {

	// TODO(petra): Add a method here for searching by name.
	
	List<RouteTouristAttraction> findByRouteOrderByOrderTravel(Route route);
	
	List<RouteTouristAttraction> findByTouristAttraction(TouristAttraction touuristAttraction);
	
}
