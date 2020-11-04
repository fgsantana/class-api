package com.github.fgsantana.apiconsumer.service;

import com.github.fgsantana.apiconsumer.client.ClassClient;
import com.github.fgsantana.apiconsumer.dto.Student;
import com.github.fgsantana.apiconsumer.exception.EnrollCodAlreadyAssociatedException;
import com.github.fgsantana.apiconsumer.exception.StudentNotFoundException;
import feign.Feign;
import feign.FeignException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ConsumerService {
    final ClassClient client;
    public List<Student> getStudents() {
        return client.getStudents();
    }
    public Student getStudent(Long id) throws StudentNotFoundException {
        try{
            return client.getStudent(id);
        }
        catch(FeignException.NotFound e){
            throw new StudentNotFoundException(id);
        }
    }

    public Student getStudentByEnrollCod(String enrollCod) throws StudentNotFoundException {
        try{
            return client.getStudentByEnrollCod(enrollCod);
        }
        catch (FeignException.NotFound e){
            throw new StudentNotFoundException(enrollCod);
        }
    }


    public Student saveStudent(Student student) throws EnrollCodAlreadyAssociatedException {
        try{
            return client.saveStudent(student);
        }
        catch (FeignException.BadRequest e){
            throw new EnrollCodAlreadyAssociatedException(student.getEnrollCod());
        }
    }


  /* In case of the external web service doesn't have an endpoint to retrieve a specific resource
    public Student getStudent(Long id) throws StudentNotFoundException {
        List<Student> student = client.getStudents().stream()
                .filter(s -> s.getId().equals(id)).collect(Collectors.toList());
        if(student.isEmpty()){
            throw new StudentNotFoundException(id);
        }
        return student.get(0);


    }
    */
}
