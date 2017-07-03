package com.propulsion.travel.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.propulsion.travel.domain.Route;
import com.propulsion.travel.repository.RouteRepository;

@Service
@Transactional
public class DefaultRouteService implements RouteService {

	private RouteRepository routeRepository;
	
	@Autowired
	public DefaultRouteService(RouteRepository routerRepository) {
		this.routeRepository = routerRepository;
	}
	
	
	@Override
	public Route findById(Long id) {
		return routeRepository.findById(id);
	}


	@Override
	public List<Route> findAll() {
		return routeRepository.findAll();
	}

}
