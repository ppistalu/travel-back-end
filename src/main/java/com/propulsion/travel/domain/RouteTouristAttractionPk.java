package com.propulsion.travel.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RouteTouristAttractionPk implements Serializable{
	
    private Long route;
    private Long touristAttraction;

}


