package com.gaurav.springdatarest.controller;

import com.gaurav.springdatarest.model.Event;
import com.gaurav.springdatarest.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/events")
public class EventCustomController {

    @Autowired
    EventRepository eventRepository;

    @PostMapping("/start/{id}")
    public ResponseEntity<?> start(@PathVariable  Long id){
        Event event = eventRepository.findById(id).get();

        if( event == null){
            throw new ResourceNotFoundException();
        }
        event.setStarted(true);
        eventRepository.save(event);
        return new ResponseEntity<>("Event Started", HttpStatus.OK);
    }
}
