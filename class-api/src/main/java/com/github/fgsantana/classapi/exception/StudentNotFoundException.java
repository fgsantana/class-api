package com.github.fgsantana.classapi.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long id) {
        super("Student with id " + id + " not found!");
    }
    public StudentNotFoundException(String enrollCod){
        super("Student with enrollment code " + enrollCod + " not found!");
    }
}
