package com.github.fgsantana.classapi.repository;

import com.github.fgsantana.classapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClassRepository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT * FROM student WHERE enroll_cod=?1", nativeQuery=true)
    public Optional<Student> findByEnrollCod(String enrollCod);
}
