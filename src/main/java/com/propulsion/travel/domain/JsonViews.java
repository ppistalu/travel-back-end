package com.propulsion.travel.domain;

import com.fasterxml.jackson.annotation.JsonView;


/**
 * Views for use with {@link JsonView @JsonView}.
 */
public interface JsonViews {
	
	interface Main {
	}
	
	interface Summary extends Main{
	}
	
	interface Details extends Summary {
	}

}