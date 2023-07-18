package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    public ErrorMessage(String msg) {
        this.msg = msg;
    }

    private HttpStatus status;
    private String msg;
}
