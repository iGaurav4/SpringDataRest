package com.gaurav.springdatarest.repository;

import com.gaurav.springdatarest.model.Organizer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {
}
