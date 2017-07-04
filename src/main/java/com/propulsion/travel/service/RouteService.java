package com.propulsion.travel.service;

import java.util.List;

import com.propulsion.travel.domain.Route;

/** Service that provides access to routes. */
public interface RouteService {
	
	/** Returns a route by providing the route {@code id}. */
	Route findById(Long id);
	
	/** Returns the list containing all the routes available. */
	List<Route> findAll();
	
	/** Returns the list of routes by name or part of the name, ignoring upper or lower cases*/
	List<Route> retrieveRoutesByName(String name);

}
