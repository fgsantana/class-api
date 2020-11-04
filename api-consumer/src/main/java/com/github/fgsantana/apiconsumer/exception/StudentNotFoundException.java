package com.github.fgsantana.apiconsumer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(Long id) {
        super("The requested student with id " + id + " was not found!");
    }
    public StudentNotFoundException(String enrollCod) {
        super("The requested student with enrollment code " + enrollCod + " was not found!");
    }
}
