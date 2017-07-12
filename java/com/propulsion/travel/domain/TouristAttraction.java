package com.propulsion.travel.domain;



import java.sql.Clob;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@EqualsAndHashCode(exclude = "id")
@NoArgsConstructor
@ToString(exclude = "routeAssoc")
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
	@Lob
	private String description;
	@JsonView(JsonViews.Summary.class)
	private String photo;
	@OneToMany(mappedBy = "touristAttraction")
	private List<RouteTouristAttraction> routeAssoc; 
}

