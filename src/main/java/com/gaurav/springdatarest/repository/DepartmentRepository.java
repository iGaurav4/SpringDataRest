package com.gaurav.springdatarest.repository;

import com.gaurav.springdatarest.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
