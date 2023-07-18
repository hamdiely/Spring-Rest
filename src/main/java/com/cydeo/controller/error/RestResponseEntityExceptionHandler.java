package com.cydeo.controller.error;

import com.cydeo.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage EmployeeNotFoundHandler(EmployeeNotFoundException ex){
      return new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage GenericExceptionHandler(Exception ex){
        return new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR,ex.getMessage());
    }

}
