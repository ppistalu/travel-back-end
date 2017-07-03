package com.propulsion.travel.service;

import java.util.List;

import com.propulsion.travel.domain.Route;

public interface RouteService {
	
	Route findById(Long id);
	
	List<Route> findAll();

}
