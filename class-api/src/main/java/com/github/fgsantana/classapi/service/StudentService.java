package com.github.fgsantana.classapi.service;

import com.github.fgsantana.classapi.exception.CodContraintViolationException;
import com.github.fgsantana.classapi.exception.StudentNotFoundException;
import com.github.fgsantana.classapi.model.Student;
import com.github.fgsantana.classapi.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {

    final StudentRepository repo;

    public Student saveStudent(Student student)  {
        try {
            return repo.save(student);
        } catch (DataIntegrityViolationException e) {
            throw new CodContraintViolationException(student.getEnrollCod());
        }
    }

    public Student getStudentById(Long id) {
        return repo.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }


    public List<Student> getStudents() {
        return repo.findAll();
    }

    public Student getStudentByEnrollCod(String enrollCod){
        return repo.findByEnrollCod(enrollCod).orElseThrow(() -> new StudentNotFoundException(enrollCod));
    }
}
