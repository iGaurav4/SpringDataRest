package com.gaurav.springdatarest.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String streetAddress1;

    private String streetAddress2;

    private String city;

    private String state;

    private String country;

    private String postalCode;

}
