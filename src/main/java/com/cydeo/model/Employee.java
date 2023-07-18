package com.cydeo.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;

@Data
public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String department;
}
