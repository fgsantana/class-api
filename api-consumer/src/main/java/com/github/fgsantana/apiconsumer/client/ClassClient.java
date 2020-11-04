package com.github.fgsantana.apiconsumer.client;

import com.github.fgsantana.apiconsumer.dto.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(url = "http://localhost:8080/api/students", name = "class")
public interface ClassClient {
    @GetMapping
    List<Student> getStudents();

    @GetMapping("/{id}")
    Student getStudent(@PathVariable("id") Long id);

    @GetMapping("/cod/{enrollCod}")
    Student getStudentByEnrollCod(@PathVariable("enrollCod") String enrollCod);

    @PostMapping
    Student saveStudent(Student student);
}
