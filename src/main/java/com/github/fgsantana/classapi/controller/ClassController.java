package com.github.fgsantana.classapi.controller;

import com.github.fgsantana.classapi.model.Student;
import com.github.fgsantana.classapi.repository.ClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ClassController {
    final ClassRepository repo;

    @GetMapping
    public Student getStu(){
        return Student.builder().name("Jim").age(20).gender("M").enrolCod("123").build();
    }

}
