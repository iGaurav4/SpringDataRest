package com.gaurav.springdatarest.repository;

import com.gaurav.springdatarest.model.Event;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
}
