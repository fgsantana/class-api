package com.github.fgsantana.classapi.service;

import com.github.fgsantana.classapi.exception.CodContraintViolationException;
import com.github.fgsantana.classapi.model.Student;
import com.github.fgsantana.classapi.repository.ClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClassService {

    final ClassRepository repo;

    public Student saveStudent(Student student) throws CodContraintViolationException {
        try{
           return repo.save(student);
        }
        catch(DataIntegrityViolationException e){
            throw new CodContraintViolationException(student.getEnrolCod());
        }
    }


}
