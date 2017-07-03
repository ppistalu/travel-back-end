package com.propulsion.travel.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.propulsion.travel.domain.JsonViews;
import com.propulsion.travel.domain.Route;
import com.propulsion.travel.service.RouteService;


@RestController
@RequestMapping("/home")
public class RestRouteController {
	
	private final RouteService routeService;
	
	@Autowired
	public RestRouteController(RouteService routeService) {
		this.routeService = routeService;
	}
	
	@JsonView(JsonViews.Main.class)
	@GetMapping
	public List<Route> retreiveAllRoutes(){
		return routeService.findAll();
	}

}
