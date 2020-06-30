package com.gaurav.springdatarest.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private Boolean checkedIn;

    @ManyToOne(fetch = FetchType.EAGER)
    private Event event;
}
