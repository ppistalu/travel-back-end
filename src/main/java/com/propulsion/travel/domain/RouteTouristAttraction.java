package com.propulsion.travel.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "route_tourist_attraction")
@IdClass(RouteTouristAttractionPk.class)
public class RouteTouristAttraction {
	
	@Id
	@ManyToOne
    @JoinColumn(name = "route_id", referencedColumnName = "id")
	private Route route;
	
	@Id
    @ManyToOne
    @JoinColumn(name = "tourist_attraction_id", referencedColumnName = "id")
	private TouristAttraction touristAttraction;
	
	@Column(name = "orderTravel")
    private int orderTravel;
		
}

