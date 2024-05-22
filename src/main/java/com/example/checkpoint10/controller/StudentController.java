package com.example.checkpoint10.controller;

import com.example.checkpoint10.service.StudentService;
import com.example.checkpoint10.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> insertStudent(@RequestBody Student student){
        Student student1 = studentService.insertStudent(student);
        return ResponseEntity.ok(student1);
    }


}
