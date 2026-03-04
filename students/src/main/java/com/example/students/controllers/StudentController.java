package com.example.students.controllers;

import com.example.students.models.Student;
import com.example.students.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<Student>> getAllStudentsBySchoolId(@PathVariable ("school-id") Integer schoolId){
        return ResponseEntity.ok(studentService.getAllStudentsBySchoolId(schoolId));
    }
}
