package com.github.fgsantana.classapi.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private Long id;

    private String name;

    @Column(length = 1)
    private String gender;

    private int age;

    @Column(unique = true)
    private String enrolCod;
}
