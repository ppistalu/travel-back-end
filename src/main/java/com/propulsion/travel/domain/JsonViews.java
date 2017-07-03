package com.propulsion.travel.domain;

import com.fasterxml.jackson.annotation.JsonView;


/**
 * Views for use with {@link JsonView @JsonView}.
 */
public interface JsonViews {
	
	interface Summary{
	}
	
	interface Details extends Summary {
	}

}