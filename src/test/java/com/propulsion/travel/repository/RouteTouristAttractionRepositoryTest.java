package com.propulsion.travel.repository;



import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Collectors;

import org.hibernate.transform.ToListResultTransformer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.ActuatorMetricWriter;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.propulsion.travel.domain.Route;
import com.propulsion.travel.domain.TouristAttraction;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@Transactional
@Sql("/test-data.sql")
public class RouteTouristAttractionRepositoryTest {

	@Autowired
	RouteRepository routeRepository;
	
	@Autowired
	RouteTouristAttractionRepository rTArepository;
	
	@Autowired
	TouristAttractionRepository touristAttraction;
	
	@Test
	public void test() {
		Route route = routeRepository.findById(1L);
		assertThat(rTArepository.findByRouteOrderByOrderTravel(route).size()).isEqualTo(3);
	}
	
//	@Test
//	public void testfindRoutes() {
//		Route route1 = routeRepository.findById(1L);
//		Route route2 = routeRepository.findById(2L);
//		Route route3 = routeRepository.findById(3L);
//		TouristAttraction att = touristAttraction.findByName("Europaallee");
//		assertThat(rTArepository.findByTouristAttraction(att).stream().map(e -> e.getTouristAttraction()).collect(Collectors.toList())).containsExactlyInAnyOrder(route1,route2,route3);
//	}
	
//	@Test
//	public void test() {
//		Route route = routeRepository.findById(1L);
//		assertThat(rTArepository.findByRouteOrderByOrderTravel(route).stream().map(e -> e.getTouristAttraction()).collect(Collectors.toList()).stream().map(e -> e.getName()).collect(Collectors.toList())).isEqualTo(route);
//	}
	
	
//	@Test
//	public void testList() {
//		Route route = routeRepository.findById(1L);
//		assertThat(rTArepository.findByRouteOrderByOrderTravel(route).stream().map(e -> e.getTouristAttraction()).collect(Collectors.toList())).isEqualTo(route);
//	}
	


}



