package com.github.fgsantana.apiconsumer.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;
    @NotEmpty
    private String name;

    @NotEmpty
    @Size(max = 1, min = 1,message = "Gender must be F or M!")
    private String gender;

    @NotNull
    private Long age;


    @NotEmpty
    private String enrollCod;
}
