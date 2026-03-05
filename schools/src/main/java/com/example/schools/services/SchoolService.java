package com.example.schools.services;

import com.example.schools.client.StudentClient;
import com.example.schools.dtos.FullSchoolResponseDto;
import com.example.schools.dtos.StudentDto;
import com.example.schools.models.School;
import com.example.schools.repositories.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;

    public void createSchool(School school){
        schoolRepository.save(school);
    }

    public List<School> getAllSchools(){
        return schoolRepository.findAll();
    }

    public FullSchoolResponseDto getSchoolWithAllStudents(Integer schoolId){
        School school = schoolRepository.findById(schoolId)
                .orElse(School.builder()
                        .name("NOT_FOUND")
                        .email("NOT_FOUND")
                        .build());
        List<StudentDto> students = studentClient.getStudentsBySchool(schoolId);

        return FullSchoolResponseDto.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
