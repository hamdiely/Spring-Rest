package com.cydeo.controller;

import com.cydeo.model.Employee;
import com.cydeo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class Employee_Controller {
     @Autowired
     private  EmployeeService employeeService;
    @PostMapping
    public Employee save(@RequestBody Employee employee){
       return  employeeService.save(employee);

    }
    @GetMapping("/all")
    public List<Employee> getAllEmployee(){

        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable  String id){

       return employeeService.getEmployeeById(id);

    }
    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable String id){
       return employeeService.deleteEmployeeById(id);
    }


}
