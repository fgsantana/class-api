package com.github.fgsantana.classapi.controller;

import com.github.fgsantana.classapi.exception.CodContraintViolationException;
import com.github.fgsantana.classapi.model.Student;
import com.github.fgsantana.classapi.repository.ClassRepository;
import com.github.fgsantana.classapi.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ClassController {
    final ClassService service;

    @PostMapping
    public Student getStu(@RequestBody @Valid Student student) throws CodContraintViolationException {
        return service.saveStudent(student);

}
    }



