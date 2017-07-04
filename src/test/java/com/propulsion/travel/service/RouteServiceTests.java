package com.propulsion.travel.service;


import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.propulsion.travel.domain.Route;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = NONE)
@Transactional
//@Sql("/test-data.sql")
public class RouteServiceTests {

	@Autowired
	RouteService service;
	
	@Test
	public void test() {
		assertThat(service.findById(1L).getName()).isEqualTo("zurich center");
	}

	
	@Test
	public void findByNameContaining() {
		Route route1 = service.findById(1L);
		Route route2 = service.findById(2L);
		Route route3 = service.findById(3L);
		assertThat(service.retrieveRoutesByName("Ich")).hasSize(3);
		assertThat(service.retrieveRoutesByName("IcH")).containsExactlyInAnyOrder(route1,route2,route3);
	}

}
