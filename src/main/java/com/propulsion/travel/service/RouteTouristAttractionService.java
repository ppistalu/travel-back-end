package com.propulsion.travel.service;

import java.util.List;

import com.propulsion.travel.domain.Route;
import com.propulsion.travel.domain.TouristAttraction;

public interface RouteTouristAttractionService {
	
	List<TouristAttraction> findAttractionsInOrder(Route route);
	
	List<Route> findAllRoutesContainingTouristAttraction(TouristAttraction att);
}
