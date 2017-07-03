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

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@Transactional
@Sql("/test-data.sql")
public class TouristAttractionRepositoryTests {
	
	@Autowired
	TouristAttractionRepository repository;

	@Test
	public void findById() {
		assertThat(repository.findById(10L).getName()).isEqualTo("Europaallee");
	}

	
	@Test
	public void findByName() {
		assertThat(repository.findByName("Europaallee").getId()).isEqualTo(10L);
	}
}
