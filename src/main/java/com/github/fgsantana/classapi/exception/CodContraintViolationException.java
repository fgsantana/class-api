package com.github.fgsantana.classapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CodContraintViolationException extends RuntimeException {
    public CodContraintViolationException(String cod){
        super("A student with this enrollment cod " + cod + " already exists!");
    }
}
