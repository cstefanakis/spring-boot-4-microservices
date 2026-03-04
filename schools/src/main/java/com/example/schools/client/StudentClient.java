package com.example.schools.client;

import com.example.schools.dtos.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "students-service")
public interface StudentClient {

    @GetMapping("/students/school/{schoolId}")
    List<Student> getStudentsBySchool(@PathVariable Integer schoolId);
}
