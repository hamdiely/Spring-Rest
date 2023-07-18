package com.cydeo.service;

import com.cydeo.controller.error.EmployeeNotFoundException;
import com.cydeo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> list = new LinkedList<>();
    @Override
    public Employee save(Employee emp) {

        if(emp.getId()==null){
            emp.setId(UUID.randomUUID().toString());
        }
        list.add(emp);
        return emp;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return list;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return list.stream()
                .filter(p->p.getId().equalsIgnoreCase(id))
                .findFirst().orElseThrow( ()->new EmployeeNotFoundException("Employee not found with id: "+id));
    }

    @Override
    public String deleteEmployeeById(String id) {
        Employee employee = list.stream().filter(p -> p.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Emplyee Not Found with id: " + id));

        list.remove(employee);
        return "Employee deleted with the id"+id;
    }
}
