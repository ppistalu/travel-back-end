package com.propulsion.travel.domain;



import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonView;

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
	@JsonView(JsonViews.Summary.class)
	private Long id;
	@JsonView(JsonViews.Summary.class)
	private Double longitude;
	@JsonView(JsonViews.Summary.class)
	private Double latitude;
	@JsonView(JsonViews.Summary.class)
	private String name;
	@JsonView(JsonViews.Summary.class)
	private String description;
	@OneToMany(mappedBy = "touristAttraction")
	private List<RouteTouristAttraction> routeAssoc; 
}

