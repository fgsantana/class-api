package com.github.fgsantana.classapi.controller;

import com.github.fgsantana.classapi.model.Student;
import com.github.fgsantana.classapi.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/students")
@Tag(name = "Student controller")
public class StudentController {

    final StudentService service;


    @Operation(summary = "Create a student")
    @ApiResponses
            (value = {@ApiResponse(responseCode = "201", description = "Student created"),
                    @ApiResponse(responseCode = "400", description = "Trying to create a student with an existing enrollCod")})
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody @Valid Student student) {
        return service.saveStudent(student);

    }



    @Operation(summary = "Find a student by id")
    @ApiResponses
            (value = {@ApiResponse(responseCode = "200", description = "Student with this id found"),
                    @ApiResponse(responseCode = "404", description = "Student with this id not found")})
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Long id) {
        return service.getStudentById(id);
    }


    @Operation(summary = "Find a student by enrollment code")
    @ApiResponses
            (value = {@ApiResponse(responseCode = "200", description = "Student with this enrollment code found"),
                    @ApiResponse(responseCode = "404", description = "Student with this enrollment code found")})
    @GetMapping("/cod/{enrollCod}")
    public Student getStudentByEnrollCod(@PathVariable("enrollCod") String enrollCod) {
        return service.getStudentByEnrollCod(enrollCod);
    }



    @Operation(summary = "Get all students")
    @ApiResponse(responseCode = "200", description = "All students")
    @GetMapping
    public List<Student> getStudents() {
        return service.getStudents();
    }
}



