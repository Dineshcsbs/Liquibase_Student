package com.liquibase.project.service;

import com.liquibase.project.entity.Student;
import com.liquibase.project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student createStudent(Student student) {
        int arr[]=new int[2];
        Arrays.sort(arr);
        student.setCreatedAt(new Date());
        return studentRepository.save(student);
    }
}
