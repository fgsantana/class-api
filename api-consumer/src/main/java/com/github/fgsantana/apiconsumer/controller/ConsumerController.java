package com.github.fgsantana.apiconsumer.controller;

import com.github.fgsantana.apiconsumer.dto.Student;
import com.github.fgsantana.apiconsumer.exception.StudentNotFoundException;
import com.github.fgsantana.apiconsumer.service.ConsumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ConsumerController {
    final ConsumerService service;

    @GetMapping
    public List<Student> getStudents(){

       return service.getStudents();
    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") Long id) throws StudentNotFoundException {
        return service.getStudent(id);
    }

}
