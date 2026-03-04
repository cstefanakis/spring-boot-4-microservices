package com.example.students.services;

import com.example.students.models.Student;
import com.example.students.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void createStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public List<Student> getAllStudentsBySchoolId(Integer schoolId){
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
