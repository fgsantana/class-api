package com.github.fgsantana.classapi.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    @Size(max = 1, min = 1,message = "Gender must be F or M!")
    private String gender;

    @NotNull
    private Long age;

    @Column(unique = true)
    @NotEmpty
    private String enrollCod;
}
