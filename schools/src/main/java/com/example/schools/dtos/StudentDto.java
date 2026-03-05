package com.example.schools.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private String firstname;
    private String lastname;
    private String email;
}
