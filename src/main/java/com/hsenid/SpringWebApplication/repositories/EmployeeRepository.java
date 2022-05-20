package com.hsenid.SpringWebApplication.repositories;

import com.hsenid.SpringWebApplication.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
