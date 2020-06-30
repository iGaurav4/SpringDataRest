package com.gaurav.springdatarest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

@Data
@Entity
public class Event  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private ZonedDateTime startTime;

    private ZonedDateTime endTime;

    private ZoneId zoneId;

    private Boolean started;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private Organizer organizer;

    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER,  orphanRemoval = true)
    private Set<Participant> participants;

    @ManyToOne(fetch = FetchType.EAGER)
    private Venue venue;

}
