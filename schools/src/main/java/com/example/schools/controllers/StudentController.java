package com.example.schools.controllers;

import com.example.schools.dtos.FullSchoolResponseDto;
import com.example.schools.models.School;
import com.example.schools.services.SchoolService;
import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
@RequiredArgsConstructor
public class StudentController {

    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createSchool(School school){
        schoolService.createSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> getAllSchools(){
        return ResponseEntity.ok(schoolService.getAllSchools());
    }

    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponseDto> getSchoolWithStudentsBySchoolId(@PathVariable ("school-id") Integer schoolId){
        return ResponseEntity.ok(schoolService.getSchoolWithAllStudents(schoolId));
    }
}
