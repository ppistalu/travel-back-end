package com.propulsion.travel.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import groovy.transform.ToString;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(exclude = "id")
@NoArgsConstructor
@lombok.ToString(exclude = "touristAttractionsAssoc")
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@JsonView(JsonViews.Main.class)
	private String name;
	@JsonView(JsonViews.Summary.class)
	private Integer difficulty;
	@JsonView(JsonViews.Summary.class)
	private Double duration;
	@JsonView(JsonViews.Main.class)
	private String photo;
	@OneToMany(mappedBy = "route")
	private List<RouteTouristAttraction> touristAttractionsAssoc;
}

