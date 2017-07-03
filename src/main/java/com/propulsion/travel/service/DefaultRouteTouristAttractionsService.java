package com.propulsion.travel.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propulsion.travel.domain.Route;
import com.propulsion.travel.domain.TouristAttraction;
import com.propulsion.travel.repository.RouteRepository;
import com.propulsion.travel.repository.RouteTouristAttractionRepository;

@Service
@Transactional
public class DefaultRouteTouristAttractionsService implements RouteTouristAttractionService {

	private RouteTouristAttractionRepository repository;

	@Autowired
	public DefaultRouteTouristAttractionsService(RouteTouristAttractionRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<TouristAttraction> findAttractionsInOrder(Route route) {
		return repository.findByRouteOrderByOrderTravel(route).stream().map(e -> e.getTouristAttraction()).collect(Collectors.toList());
	}

	@Override
	public List<Route> findAllRoutesContainingTouristAttraction(TouristAttraction att) {
		return repository.findByTouristAttraction(att).stream().map(e -> e.getRoute()).collect(Collectors.toList());
	}

}
