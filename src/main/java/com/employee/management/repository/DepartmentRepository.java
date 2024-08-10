package com.employee.management.repository;

import com.employee.management.model.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
    Optional<Department>findById(int id);


}
