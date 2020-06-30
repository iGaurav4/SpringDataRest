package com.gaurav.springdatarest.model.projections;

import com.gaurav.springdatarest.model.Venue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name= "virtual", types = {Venue.class})
public interface StreetAddressProjection {

//    @Value("#{target.streetAddress1} #{target.streetAddress2}")
//    getCompleteStreetAddress();
}
