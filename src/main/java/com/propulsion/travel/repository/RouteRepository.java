package com.propulsion.travel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propulsion.travel.domain.Route;
import com.propulsion.travel.domain.RouteTouristAttraction;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
	
	Route findById(Long id);
	
	List<Route> findAll();
}
