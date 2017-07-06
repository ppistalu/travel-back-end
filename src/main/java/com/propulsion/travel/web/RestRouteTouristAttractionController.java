package com.propulsion.travel.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.propulsion.travel.domain.JsonViews;
import com.propulsion.travel.domain.Route;
import com.propulsion.travel.domain.TouristAttraction;
import com.propulsion.travel.service.RouteService;
import com.propulsion.travel.service.RouteTouristAttractionService;
import com.propulsion.travel.service.TouristAttractionService;;

@RestController
@RequestMapping("/routes")
public class RestRouteTouristAttractionController {

	private final RouteTouristAttractionService rTAService;
	private final RouteService routeService;
	private final TouristAttractionService touristAttractionService;
	
	@Autowired
	public RestRouteTouristAttractionController(RouteTouristAttractionService rTAService, RouteService routeService,TouristAttractionService touristAttractionService) {		
		this.rTAService = rTAService;
		this.routeService = routeService;
		this.touristAttractionService = touristAttractionService;
	}
	
	@JsonView(JsonViews.Summary.class)
	@GetMapping("/{id}")
	public List<TouristAttraction> retreiveAllTouristAttractionInOrder(@PathVariable Long id){
		Route route = routeService.findById(id);
		return rTAService.findAttractionsInOrder(route);
	}
	
	@JsonView(JsonViews.Summary.class)
	@GetMapping("/attraction/{id}")
	public List<Route> retreiveAllRoutesThatHaveATouristAttraction(@PathVariable Long id){
		TouristAttraction  touristAttraction = touristAttractionService.findbyId(id);
		return rTAService.findAllRoutesContainingTouristAttraction(touristAttraction);
	}
	
}
