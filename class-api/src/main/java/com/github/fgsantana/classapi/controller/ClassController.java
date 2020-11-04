package com.github.fgsantana.classapi.controller;

import com.github.fgsantana.classapi.exception.CodContraintViolationException;
import com.github.fgsantana.classapi.exception.StudentNotFoundException;
import com.github.fgsantana.classapi.model.Student;
import com.github.fgsantana.classapi.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/students")
public class ClassController {
    final ClassService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody @Valid Student student){
        return service.saveStudent(student);

    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return service.getStudentById(id);
    }

    @GetMapping("/cod/{enrollCod}")
    public Student getStudentByEnrollCod(@PathVariable("enrollCod") String enrollCod){
        return service.getStudentByEnrollCod(enrollCod);
    }

    @GetMapping
    public List<Student> getStudents(){
        return service.getStudents();
    }
}



