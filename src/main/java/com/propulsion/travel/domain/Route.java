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
import com.propulsion.travel.domain.JsonViews.Details;
import com.propulsion.travel.domain.JsonViews.Main;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(exclude = "id")
@NoArgsConstructor
@ToString(exclude = "touristAttractionsAssoc")
public class Route {
	
	/** Unique identifier of a route. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonView(Main.class)
	private Long id;
	
	/** Name of the route. */
	@JsonView(JsonViews.Main.class)
	private String name;
	
	/** 
	 * Difficulty of the route, described as 1 being the easiest 
	 * and 5 being the hardest. 
	 */
	@JsonView(JsonViews.Summary.class)
	private Integer difficulty;
	
	
	@JsonView(JsonViews.Summary.class)
	private Double duration;
	@JsonView(JsonViews.Main.class)
	private String photo;
	@OneToMany(mappedBy = "route")
	private List<RouteTouristAttraction> touristAttractionsAssoc;
}

