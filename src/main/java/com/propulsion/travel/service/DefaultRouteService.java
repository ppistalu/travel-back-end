package com.propulsion.travel.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.propulsion.travel.domain.Route;
import com.propulsion.travel.repository.RouteRepository;

@Service
@Transactional
public class DefaultRouteService implements RouteService {

	private RouteRepository routerRepository;
	
	@Autowired
	public DefaultRouteService(RouteRepository routerRepository) {
		this.routerRepository = routerRepository;
	}
	
	
	@Override
	public Route findById(Long id) {
		return routerRepository.findById(id);
	}

}
