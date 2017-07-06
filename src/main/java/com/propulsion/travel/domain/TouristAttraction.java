package com.propulsion.travel.domain;



import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Data
@EqualsAndHashCode(exclude = "id")
@NoArgsConstructor
@lombok.ToString(exclude = "routeAssoc")
public class TouristAttraction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double longitude;
	private Double latitude;
	private String name;
	private String description;
	@OneToMany(mappedBy = "touristAttraction")
	private List<RouteTouristAttraction> routeAssoc; 
}

