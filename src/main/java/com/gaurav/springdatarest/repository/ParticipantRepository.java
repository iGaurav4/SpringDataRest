package com.gaurav.springdatarest.repository;

import com.gaurav.springdatarest.model.Participant;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {
}
