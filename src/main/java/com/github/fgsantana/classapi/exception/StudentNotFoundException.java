package com.github.fgsantana.classapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long id) {
        super("Student with id " + id + " not found!");
    }
    public StudentNotFoundException(String enrollCod){
        super("Student with enrollment code " + enrollCod + " not found!");
    }
}
