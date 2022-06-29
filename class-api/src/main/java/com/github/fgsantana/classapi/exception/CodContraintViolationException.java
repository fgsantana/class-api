package com.github.fgsantana.classapi.exception;

public class CodContraintViolationException extends RuntimeException {
    public CodContraintViolationException(String cod){
        super("A student with this enrollment cod " + cod + " already exists!");
    }
}
