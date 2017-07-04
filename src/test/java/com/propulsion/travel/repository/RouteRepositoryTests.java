package com.propulsion.travel.repository;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.propulsion.travel.domain.Route;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@Transactional
//@Sql("/test-data.sql")
public class RouteRepositoryTests {

	@Autowired
	RouteRepository repository;
	
	@Test
	public void test() {
		assertThat(repository.findById(1L)).isNotNull();
	}
	
	@Test
	public void findByNameContainingIgnoreCase() {
		Route route1 = repository.findById(1L);
		Route route2 = repository.findById(2L);
		Route route3 = repository.findById(3L);
		assertThat(repository.findByNameContainingIgnoreCase("Ich")).containsExactlyInAnyOrder(route1,route2,route3);
	}
}
