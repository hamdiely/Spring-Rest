package com.cydeo.service;

import com.cydeo.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee save(Employee emp);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    String deleteEmployeeById(String id);
}
