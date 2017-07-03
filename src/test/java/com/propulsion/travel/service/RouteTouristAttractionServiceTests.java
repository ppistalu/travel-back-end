package com.propulsion.travel.service;


import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.propulsion.travel.domain.Route;
import com.propulsion.travel.domain.TouristAttraction;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = NONE)
@Transactional
@Sql("/test-data.sql")
public class RouteTouristAttractionServiceTests {
	
	@Autowired
	RouteTouristAttractionService service;
	
	@Autowired
	RouteService routeService;
	
	@Autowired
	TouristAttractionService touristAttractionService;

	@Test
	public void aRouteShouldHaveTouristAttractionsInExactlyOrder() {
		Route route = routeService.findById(1L);
		TouristAttraction att1 = touristAttractionService.findbyId(10L);
		TouristAttraction att2 = touristAttractionService.findbyId(11L);
		TouristAttraction att3 = touristAttractionService.findbyId(12L);
		assertThat(service.findAttractionsInOrder(route)).containsExactly(att1,att3,att2);
	}
	
	@Test
	public void aTouristAttractionShoulBeInManyRoutes() {
		Route route1 = routeService.findById(1L);
		Route route2 = routeService.findById(2L);
		Route route3 = routeService.findById(3L);
		TouristAttraction att1 = touristAttractionService.findbyId(10L);
		assertThat(service.findAllRoutesContainingTouristAttraction(att1)).containsExactlyInAnyOrder(route1,route2,route3);
	}

}
