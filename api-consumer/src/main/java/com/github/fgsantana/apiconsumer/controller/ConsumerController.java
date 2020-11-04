package com.github.fgsantana.apiconsumer.controller;

import com.github.fgsantana.apiconsumer.dto.Student;
import com.github.fgsantana.apiconsumer.exception.EnrollCodAlreadyAssociatedException;
import com.github.fgsantana.apiconsumer.exception.StudentNotFoundException;
import com.github.fgsantana.apiconsumer.service.ConsumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequiredArgsConstructor
@RequestMapping("/api/students")
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

    @GetMapping("/bycod/{enrollCod}")
    public Student getStudentByEnrollCod(@PathVariable("enrollCod") String enrollCod) throws StudentNotFoundException {
        return service.getStudentByEnrollCod(enrollCod);

    }


    @PostMapping
    public Student createStudent(@RequestBody @Valid Student student) throws EnrollCodAlreadyAssociatedException {
        return service.saveStudent(student);
    }

}
