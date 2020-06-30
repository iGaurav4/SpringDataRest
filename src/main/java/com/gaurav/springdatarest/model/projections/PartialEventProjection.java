package com.gaurav.springdatarest.model.projections;

import com.gaurav.springdatarest.model.Event;
import org.springframework.data.rest.core.config.Projection;

import java.time.ZonedDateTime;

@Projection(name = "partial", types = {Event.class})
public interface PartialEventProjection {

    String getName();

    ZonedDateTime getStartTime();

    ZonedDateTime getEndTime();
}
