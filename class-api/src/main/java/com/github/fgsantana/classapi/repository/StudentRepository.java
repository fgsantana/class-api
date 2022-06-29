package com.github.fgsantana.classapi.repository;

import com.github.fgsantana.classapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT s FROM Student s WHERE s.enrollCod=?1")
    Optional<Student> findByEnrollCod(String enrollCod);
}
