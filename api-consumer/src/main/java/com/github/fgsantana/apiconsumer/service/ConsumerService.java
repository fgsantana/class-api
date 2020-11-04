package com.github.fgsantana.apiconsumer.service;

import com.github.fgsantana.apiconsumer.client.ClassClient;
import com.github.fgsantana.apiconsumer.dto.Student;
import com.github.fgsantana.apiconsumer.exception.StudentNotFoundException;
import feign.FeignException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ConsumerService {
    final ClassClient client;
    public List<Student> getStudents() {
        return client.getStudents();
    }

    /* In case of the external web service doesn't have an endpoint to retrieve a specific resource*/
    public Student getStudent(Long id) throws StudentNotFoundException {
        List<Student> student = client.getStudents().stream()
                .filter(s -> s.getId().equals(id)).collect(Collectors.toList());
        if(student.isEmpty()){
            throw new StudentNotFoundException(id);
        }
        return student.get(0);


    }

//    public Student getStudent(Long id) throws StudentNotFoundException {
//        try{
//            return client.getStudent(id);
//        }
//        catch(FeignException.NotFound e){
//            throw new StudentNotFoundException(id);
//        }
//    }

}
