package com.gaurav.springdatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.gaurav.springdatarest.repository"})
@SpringBootApplication
@EntityScan(basePackageClasses = {SpringdatarestApplication.class, Jsr310Converters.class})
public class SpringdatarestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdatarestApplication.class, args);
    }

}
