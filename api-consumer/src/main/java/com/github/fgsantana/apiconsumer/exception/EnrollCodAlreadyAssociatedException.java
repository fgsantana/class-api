package com.github.fgsantana.apiconsumer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EnrollCodAlreadyAssociatedException extends Throwable {
    public EnrollCodAlreadyAssociatedException(String enrollCod) {
        super("The enrollment code " +  enrollCod + " is already associated to an existent student!");
    }

}
