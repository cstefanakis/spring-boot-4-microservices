package com.example.students.repositories;

import com.example.students.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
}
