package com.github.fgsantana.classapi.repository;

import com.github.fgsantana.classapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Student, Long> {
}
