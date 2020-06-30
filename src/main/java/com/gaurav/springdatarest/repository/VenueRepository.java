package com.gaurav.springdatarest.repository;

import com.gaurav.springdatarest.model.Venue;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {
}
