package com.example.schools.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponseDto {
    private String name;
    private String email;
    private List<Student> students;
}
