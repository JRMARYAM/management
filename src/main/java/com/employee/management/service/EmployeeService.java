package com.employee.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.management.model.Employee;
import com.employee.management.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Fetching all employees
    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    // Fetching employee by ID
    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // Inserting employee
    public void addEmployee(Employee e) {
        employeeRepository.save(e);
    }

    // Updating employee by ID
    public void updateEmployee(Employee emp, int id) {
        if (id == emp.getEmployeeID()) {
            employeeRepository.save(emp);
        }
    }

    // Deleting all employees
    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }

    // Deleting employee by ID
    public void deleteEmployeeByID(int id) {
        employeeRepository.deleteById(id);
    }

    // Patching/updating employee by ID
    public void patchEmployee(Employee emp, int id) {
        if (id == emp.getEmployeeID()) {
            employeeRepository.save(emp);
        }
    }
}
