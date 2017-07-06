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
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Integer difficulty;
	private Double duration;
	@OneToMany(mappedBy = "route")
	private List<RouteTouristAttraction> touristAttractionsAssoc;
}

