package com.example.schools.client;

import com.example.schools.dtos.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "students")
public interface StudentClient {

    @GetMapping("/api/students/school/{schoolId}")
    List<StudentDto> getStudentsBySchool(@PathVariable Integer schoolId);
}
