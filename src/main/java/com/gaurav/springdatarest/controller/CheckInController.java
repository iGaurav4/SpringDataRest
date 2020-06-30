package com.gaurav.springdatarest.controller;

import com.gaurav.springdatarest.model.Participant;
import com.gaurav.springdatarest.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/events")
public class CheckInController {

    @Autowired
    ParticipantRepository participantRepository;
    @PostMapping("/checkin/{id}")
    public ResponseEntity<?> checkIn(@PathVariable Long id){
        Participant participant = participantRepository.findById(id).get();

        if(participant!=null){
            if (participant.getCheckedIn()){
                return new ResponseEntity<>("Already checked in", HttpStatus.CONFLICT);
            }else{
                participant.setCheckedIn(true);
                participantRepository.save(participant);
            }
        }
        return new ResponseEntity<>(participant.getName() + " has been checked in.", HttpStatus.OK);
    }
}
