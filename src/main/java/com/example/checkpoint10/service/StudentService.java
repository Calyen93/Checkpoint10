package com.example.checkpoint10.service;

import com.example.checkpoint10.models.Student;
import com.example.checkpoint10.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student insertStudent(Student student){
        return studentRepository.save(student);
    }
}
